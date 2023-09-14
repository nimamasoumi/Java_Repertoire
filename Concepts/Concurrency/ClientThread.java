package Concepts.Concurrency;

import java.util.Arrays;

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
            System.out.printf("Data %s is received. The parameters are: \n", ii+1);
            System.out.print(Arrays.toString(rt));
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