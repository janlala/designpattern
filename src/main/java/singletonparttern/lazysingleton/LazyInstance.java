package singletonparttern.lazysingleton;

/**
 * 懒汉式单例
 * 优点：延迟加载
 * 缺点：线程不安全，反射和反序列化破坏单例
 */
public class LazyInstance {
    private static LazyInstance instance = null;

    private LazyInstance(){
        if (null != instance)//防止反射创建单例
        {
            throw new RuntimeException("不允许创建多个单例！");
        }
    };

    public static LazyInstance getInstance()
    {
        if(null == instance)
        {
            instance = new LazyInstance();
        }
        return instance;
    }

    //线程安全，效率低
//    public synchronized static LazyInstance getInstance()
//    {
//        if(null == instance)
//        {
//            instance = new LazyInstance();
//        }
//        return instance;
//    }

    //防止反序列化,原因序列化时readObject()->readObject0()->readOrdinaryObject()->hasReadResolveMethod()
    private Object readResolve(){
        return instance;
    }
}
