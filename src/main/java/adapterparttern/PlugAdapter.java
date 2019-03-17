package adapterparttern;

public class PlugAdapter implements ThreeLegsPlug{
    private DoubleLegsPlug plug;

    public PlugAdapter(DoubleLegsPlug plug)
    {
        this.plug = plug;
    }

    public void charge()
    {
        plug.charge();
    }
}
