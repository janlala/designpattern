package factoryparttern.FactoryMethod;

import factoryparttern.SimpleFactory.Electricity;

public interface ElectricFactory {
    Electricity createObject();
}
