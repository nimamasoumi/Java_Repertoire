package Concepts.Concurrency;

// The data between client and server are rigid transformation parameters
public class DataClientServer
{
    double tx, ty, tz, a, b, c;
    public DataClientServer(double[] _params){
        tx=_params[0];ty=_params[1];tz=_params[2];
        a=_params[3];b=_params[4];c=_params[5];
    }   

    public synchronized void setParams(double[] _params)
    {
        tx=_params[0];ty=_params[1];tz=_params[2];
        a=_params[3];b=_params[4];c=_params[5];
    }
    public synchronized double[] getParams()
    {
        double[] _params = {tx,ty,tz,a,b,c};
        return _params;
    }
}