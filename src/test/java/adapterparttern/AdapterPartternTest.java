package adapterparttern;

public class AdapterPartternTest {
    public static void main(String[] args) {
        DoubleLegsPlug doubleLegsPlug = new DoubleLegsPlug();
        PlugAdapter plugAdapter = new PlugAdapter(doubleLegsPlug);
        plugAdapter.charge();
    }
}
