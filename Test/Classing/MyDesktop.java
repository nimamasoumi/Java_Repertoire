package Test.Classing;

public class MyDesktop extends MyComputer{
    int num_cpu = 6;
    int price = 800;
    String type="desktop";

    @Override
    public int GetPrice()
    {
        return this.price;
    }

    @Override
    public String GetType()
    {
        return this.type;
    }

    // Variables don't override in Java, so we have to do this
    @Override
    public int GetNumCPU()
    {
        return this.num_cpu;
    }
}
