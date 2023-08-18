package Test.Classing;

public class MyLaptop implements IComputer{

    int num_cpu = 2;
    int price = 1300;
    String type="laptop";
    String name;

    public int GetPrice()
    {
        return this.price;
    }

    public String GetType()
    {
        return this.type;
    }

    public int GetNumCPU()
    {
        return this.num_cpu;
    }

    public void SetName(final String nm)
    {
        this.name = nm;
    }

    // It doesn't matter to have Override
    @Override
    public String GetName()
    {
        return this.name;
    }    
}
