package factoryparttern.AbstractFactory;

public class FactoryMethodClient {
    public static void  main(String[] args)
    {
        GreeFactory greeFactory = new GreeFactory();
        Washer greeWasher = greeFactory.produceWasher();
        Fridge greeFridge = greeFactory.produceFridge();
    }
}


