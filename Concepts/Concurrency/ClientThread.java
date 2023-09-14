package Concepts.Concurrency;

public class ClientThread implements Runnable
{
    private DataClientServer dataRT;
    public ClientThread(DataClientServer _dataRT)
    {
        this.dataRT = _dataRT;
    }
    @Override
    public void run()
    {
        for (int ii=0;ii<5;ii++)
        {
            double[] rt = dataRT.getParams();
            System.out.println("The parameters are: ");
            System.out.print(rt);
            System.out.print("\n");
            try
            {
                Thread.sleep(4000);                
            }
            catch(Exception e)
            {
                System.out.println("Encountered an exception in client!");
                e.printStackTrace();
            }
        }

    }
}