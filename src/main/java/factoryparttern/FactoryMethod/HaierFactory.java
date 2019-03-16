package factoryparttern.FactoryMethod;

import factoryparttern.SimpleFactory.Electricity;
import factoryparttern.SimpleFactory.Haier;

public class HaierFactory implements ElectricFactory{
    public Electricity createObject() {
        return new Haier();
    }
}
