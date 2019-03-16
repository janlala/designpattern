package factoryparttern.AbstractFactory;

public class MideaFactory extends AbstractFactory{
    @Override
    public Fridge produceFridge() {
        return new MideaFridge();
    }

    @Override
    public Washer produceWasher() {
        return new MideaWasher();
    }
}
