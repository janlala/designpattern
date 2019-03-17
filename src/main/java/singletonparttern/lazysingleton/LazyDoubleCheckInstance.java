package singletonparttern.lazysingleton;

import java.io.Serializable;

/**
 * 懒汉式双重检测
 * 优点：线程安全，延迟加载，效率比直接在方法上加锁效率高
 * 缺点：使用synchronized关键字效率低
 */
public class LazyDoubleCheckInstance implements Serializable {
    private static volatile LazyDoubleCheckInstance instance = null;//防止指令重排序

    private LazyDoubleCheckInstance(){
        if(null != instance)//防止反射创建多个单例
        {
            throw new RuntimeException("不可创建多个单例!");
        }
    };

    public static LazyDoubleCheckInstance getInstance(){
        if(null == instance)
        {
            synchronized (LazyDoubleCheckInstance.class)
            {
                if(null == instance)//若不加判断可能会实例化多次，外部安全，内部不安全
                {
                    instance = new LazyDoubleCheckInstance();
                    //CPU执行时候会转换成JVM指令
                    //指令重排序问题，volatile
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、将初始化好的对象和内存地址建立关联，赋值
                    //4、用户初次访问
                }
            }
        }
        return instance;
    }

    //防止反序列化创建多个单例,原因序列化时readObject()->readObject0()->readOrdinaryObject()->hasReadResolveMethod()
    private Object readResolve()
    {
        return instance;
    }
}
