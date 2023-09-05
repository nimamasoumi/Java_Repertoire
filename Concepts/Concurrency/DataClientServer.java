package Concepts.Concurrency;

// The data between client and server are rigid transformation parameters
public class DataClientServer
{
    double tx, ty, tz, a, b, c;
    private boolean dataExpired = true;
    public DataClientServer(double[] _params){
        tx=_params[0];ty=_params[1];tz=_params[2];
        a=_params[3];b=_params[4];c=_params[5];
    }   

    public synchronized void setParams(double[] _params)
    {
        while(!dataExpired)
        {
            try{
                // wait until new data is provided by the server
                wait();
            }catch (InterruptedException e){}
        }
        dataExpired = false;
        tx=_params[0];ty=_params[1];tz=_params[2];
        a=_params[3];b=_params[4];c=_params[5];
        notifyAll();
    }
    public synchronized double[] getParams()
    {        
        while(dataExpired)
        {
            try{
                // client waits until new data is available 
                wait();
            }catch (InterruptedException e){}            
        }
        dataExpired=true;
        double[] params = {tx,ty,tz,a,b,c};
        notifyAll();
        return params;
    }
}