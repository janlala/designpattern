package enumsingleton;

import singletonparttern.enuminsingleton.EnumInstance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumInstanceTest {
    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.getInstance();

        EnumInstance instance1 = null;
        EnumInstance instance2 = null;

        try{
//            Class<?> clazz = EnumInstance.class;
//            Constructor<?> c = clazz.getDeclaredConstructor(null);
//            c.setAccessible(true);
//            instance1 = (EnumInstance)c.newInstance();

            FileOutputStream fos = new FileOutputStream("a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance2 = (EnumInstance) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }

//        System.out.println(instance == instance1);
        System.out.println(instance == instance2);

    }
}
