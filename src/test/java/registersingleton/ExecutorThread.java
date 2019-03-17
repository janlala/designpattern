package registersingleton;


import singletonparttern.registersingleton.ContainerInstance;

public class ExecutorThread implements Runnable{
    public void run() {
        ContainerInstance instance = (ContainerInstance) ContainerInstance.getInstance("singtonparttern.registersingleton.ContainerInstance");

        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
