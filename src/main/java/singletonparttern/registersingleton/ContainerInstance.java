package singletonparttern.registersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 */
public class ContainerInstance {
    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    private ContainerInstance(){}

    public static Object getInstance(String className) {
        synchronized (map)
        {
            if (map.containsKey(className))
            {
                return map.get(className);
            }
            else
            {
                Object obj = null;
                try{
                    obj = Class.forName(className).newInstance();
                    map.put(className, obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return  obj;
            }
        }
    }
}
