package Concepts.Concurrency;

class GuardedBlockTest
{    
    public static void main(String[] args)
    {
        double[] rt = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        DataClientServer dataRT = new DataClientServer(rt);
        
        (new Thread(new ServerThread(dataRT))).start();
        (new Thread(new ClientThread(dataRT))).start();
    }
}