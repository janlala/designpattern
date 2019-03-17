package hungersingleton;

import singletonparttern.hungersingleton.HungerInstance;

import java.io.*;
import java.lang.reflect.Constructor;

public class HungerInstanceTest {
    public static void main(String[] args) {
        HungerInstance instance = HungerInstance.getInstance();

        HungerInstance instance1 = null;
        HungerInstance instance2 = null;
                Class<?> clazz = HungerInstance.class;
        try {
            Constructor<?> c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            instance1 = (HungerInstance)c.newInstance();

            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance2 = (HungerInstance)ois.readObject();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(instance == instance1);
        System.out.println(instance == instance2);

    }
}
