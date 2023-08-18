package Test.Classing;

public class AbsClassTest {
     
    public static void main(String[] args)
    {
        MyDesktop dell = new MyDesktop();
        dell.SetName("Nima_PC");

        System.out.println("My computer type is a "+dell.GetType()+".");
        System.out.printf("My %s name is: %s\n",dell.GetType(),dell.GetName());
        System.out.printf("My %s has %s CPU cores.\n",dell.GetType(),dell.GetNumCPU());
        System.out.printf("My %s price is %s CAD.\n\n",dell.GetType(),dell.GetPrice());

        MyLaptop xps = new MyLaptop();
        xps.SetName("Nima_XPS");

        System.out.println("My computer type is a "+xps.GetType()+".");
        System.out.printf("My %s name is: %s\n",xps.GetType(),xps.GetName());
        System.out.printf("My %s has %s CPU cores.\n",xps.GetType(),xps.GetNumCPU());
        System.out.printf("My %s price is %s CAD.\n",xps.GetType(),xps.GetPrice());


    }
}
