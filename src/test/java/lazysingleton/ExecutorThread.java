package lazysingleton;

import singletonparttern.lazysingleton.LazyDoubleCheckInstance;

public class ExecutorThread implements Runnable{
    public void run() {
        LazyDoubleCheckInstance instance = LazyDoubleCheckInstance.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
