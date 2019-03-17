package singletonparttern.hungersingleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * 优点：线程安全，效率高
 * 缺点：非延迟加载，反射、反序列化实例破坏线程单例
 */
public class HungerInstance implements Serializable {
    private static final HungerInstance instance = new HungerInstance();

    private HungerInstance(){
        if(null != instance)//防止反射创建多个单例
        {
            throw new RuntimeException("不可创建多个单例!");
        }
    };

    public static HungerInstance getInstance()
    {
        return HungerInstance.instance;
    }

    //防止反序列化多个单例,原因序列化时readObject()->readObject0()->readOrdinaryObject()->hasReadResolveMethod()
    private Object readResolve()
    {
        return instance;
    }
}
