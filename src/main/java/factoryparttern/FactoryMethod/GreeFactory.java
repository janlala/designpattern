package factoryparttern.FactoryMethod;

import factoryparttern.SimpleFactory.Electricity;
import factoryparttern.SimpleFactory.Gree;

public class GreeFactory implements ElectricFactory{
    public Electricity createObject() {
        return new Gree();
    }
}
