package factoryparttern.FactoryMethod;

import factoryparttern.SimpleFactory.Electricity;

public class FactoryMehodClient {
    public static void main(String[] args)
    {
        GreeFactory greeFactory = new GreeFactory();
        Electricity gree = greeFactory.createObject();
    }
}
