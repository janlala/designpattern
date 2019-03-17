package singletonparttern.lazysingleton;

/**
 * 内部类创建单例
 * 优点：延迟加载，线程安全
 */
public class LazyInnerClassInstance {
    private LazyInnerClassInstance(){
        if(null != InnerClass.instance)//防止反射创建多个单例
        {
            throw new RuntimeException("不可创建多个单例!");
        }
    };

    private static class InnerClass{
        private static final LazyInnerClassInstance instance = new LazyInnerClassInstance();
    }

    public LazyInnerClassInstance getInstance()
    {
        return InnerClass.instance;
    }

    //防止反序列化创建多个单例,原因序列化时readObject()->readObject0()->readOrdinaryObject()->hasReadResolveMethod()
    private Object readResolve()
    {
        return InnerClass.instance;
    }
}
