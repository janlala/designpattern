package factoryparttern.SimpleFactory;

public class SimpleFactoryClient{
    public static void main(String[] args)
    {
        Electricity haier = SimpleFactory.createObject("Haier");
    }
}
