package factoryparttern.AbstractFactory;

public class GreeFactory extends AbstractFactory{
    public Fridge produceFridge()
    {
        return new GreeFridge();
    }

    public Washer produceWasher()
    {
        return new GreeWasher();
    }
}
