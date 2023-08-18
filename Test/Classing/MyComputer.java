package Test.Classing;

public abstract class MyComputer {
    
    String name;
    int num_cpu;
    int price;
    String type;

    public void SetName(final String nm)
    {
        this.name = nm;
    }
    public String GetName()
    {
        return this.name;
    }
    public int GetNumCPU()
    {
        return this.num_cpu;
    }
    public abstract int GetPrice();
    public abstract String GetType();
}
