package factoryparttern.FactoryMethod;

import factoryparttern.SimpleFactory.Electricity;
import factoryparttern.SimpleFactory.Midea;

public class MideaFactory implements ElectricFactory{
    public Electricity createObject() {
        return new Midea();
    }
}
