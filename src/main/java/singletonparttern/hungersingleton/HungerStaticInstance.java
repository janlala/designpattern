package singletonparttern.hungersingleton;

/**
 * 静态块创建单例
 */
public class HungerStaticInstance {
    private static HungerStaticInstance instance;

    static {
        instance = new HungerStaticInstance();
    }

    private HungerStaticInstance(){
        if(null != instance)//防止反射创建多个单例
        {
            throw new RuntimeException("不可创建多个单例!");
        }
    };

    public static HungerStaticInstance getInstance()
    {
        return instance;
    }

    //防止反序列化创建多个单例,原因序列化时readObject()->readObject0()->readOrdinaryObject()->hasReadResolveMethod()
    private Object readResolve()
    {
        return instance;
    }
}
