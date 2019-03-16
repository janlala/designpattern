
package factoryparttern.SimpleFactory;
public class SimpleFactory{
    private static final String GREE = "Gree";//格力
    private static final String HAIER = "Haier";//海尔
    private static final String MIDEA = "Midea";//美的

    public static Electricity createObject(String objectName) {
        if (GREE.equalsIgnoreCase(objectName)) {
            return new Gree();
        }
        else if(HAIER.equalsIgnoreCase(objectName))
        {
            return new Haier();
        }
        else if(MIDEA.equalsIgnoreCase(objectName))
        {
            return new Midea();
        }
        else
        {
            return null;
        }
    }

}
