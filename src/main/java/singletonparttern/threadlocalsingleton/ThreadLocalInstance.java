package singletonparttern.threadlocalsingleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> instance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){};

    public static ThreadLocalInstance getInstance()
    {
        return instance.get();
    }
}
