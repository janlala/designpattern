package factoryparttern.AbstractFactory;

public class HaierFactory extends AbstractFactory{
    public Washer produceWasher()
    {
        return new HaierWasher();
    }

    @Override
    public Fridge produceFridge() {
        return new HaierFridge();
    }
}
