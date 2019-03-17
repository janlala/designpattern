package lazysingleton;

import singletonparttern.lazysingleton.LazyDoubleCheckInstance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class LazyInstanceTest {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new ExecutorThread());
//        Thread t2 = new Thread(new ExecutorThread());
//
//        t1.start();
//        t2.start();
//
//        System.out.println("execute end!");

        LazyDoubleCheckInstance instance = LazyDoubleCheckInstance.getInstance();

        LazyDoubleCheckInstance instance1 = null;
        LazyDoubleCheckInstance instance2 = null;
        Class<?> clazz = LazyDoubleCheckInstance.class;
        try{
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            instance1 = (LazyDoubleCheckInstance)c.newInstance();

            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance2 = (LazyDoubleCheckInstance)ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(instance == instance1);

        System.out.println(instance == instance2);

    }
}
