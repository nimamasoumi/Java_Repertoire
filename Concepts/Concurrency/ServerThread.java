package Concepts.Concurrency;

import java.util.Vector;

import javax.xml.crypto.Data;

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
        Vector<Double[]> transData = new Vector<Double[]>();
        Double[] rt={1.0,2.0,3.0,30.0,60.0,90.0};
        transData.add(rt);
        //rt.fill(1.0,2.0,3.0,30.0,60.0,90.0);
        //transData.add(rt);
    }
}