package Concepts.Concurrency;

public class ServerThread implements Runnable
{
    private DataClientServer dataRT;
    public ServerThread(DataClientServer _dataRT)
    {
        this.dataRT=_dataRT;
    }
    @Override 
    public void run()
    {
        double[][] rt={{1.0,2.0,3.0,30.0,60.0,90.0},
                        {1.5,2.5,3.5,35.0,65.0,95.0},
                        {2.0,3.0,4.0,40.0,70.0,100.0},
                        {2.5,3.5,4.5,45.0,75.0,105.0},
                        {3.0,4.0,5.0,50.0,80.0,110.0}};

        for (int ii=0;ii<5;ii++)
        {
            this.dataRT.setParams(rt[ii]);
        }
        try
        {
            Thread.sleep(4000);
        }
        catch(Exception e)
        {
            System.out.println("Encountered an exception in server!");
            e.printStackTrace();
        }
    }
}