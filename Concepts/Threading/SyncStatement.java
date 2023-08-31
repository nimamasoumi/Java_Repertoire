package Concepts.Threading;

// Demostrating the synchronized statement in a simple example
public class SyncStatement
{
    public static void main(String args[])
    {
        int N = 19;
        CountAsync cntAsyc = new CountAsync(N);
        Thread t1 = (new Thread(new Runnable(){
            @Override
            public void run()
            {
                synchronized(cntAsyc)
                {
                    int n=5;
                    while(n>0)
                    {
                        cntAsyc.CountUp();
                        System.out.printf((char)27+"[34m"+"Counting Down! The number is: %s\n",cntAsyc.getNum());
                        n--;
                    }
                }
            }
        }));
        Thread t2 = (new Thread(new Runnable(){
            @Override
            public void run()
            {                                
                int n=5;
                while(n>0)
                {
                    cntAsyc.CountUp();
                    System.out.printf((char)27+"[36m"+"Counting Up! The number is: %s\n",cntAsyc.getNum());
                    n--;
                }            
            }
        }));

        try{
            t1.start();t2.start();
            t2.join();
        }catch(InterruptedException e)
        {
            System.out.println("Somthing went wrong!");
            return;
        }
        return;
    }
}