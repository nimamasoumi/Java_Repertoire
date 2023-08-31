package Concepts.Threading;

// Testing synchronization of threads
public class AsyncThread {

    public static void main(String args[])
    {
        int N=19;
        CountAsync csy1 = new CountAsync(N);
        // This thread counts down the number
        Thread t1 = (new Thread(new Runnable()
        {
            @Override
            public void run(){
                int kk=6;
                while (kk>0)
                {
                    csy1.CountDown();
                    System.out.printf((char)27+"[34m"+"Counting Down! The number is: %s\n",csy1.getNum());
                    kk--;
                }                
            }            
        }));
        // This thread counts up the number
        Thread t2 = (new Thread(new Runnable()
        {
            @Override
            public void run(){
                int jj=4;
                while (jj>0)
                {
                    csy1.CountUp();
                    System.out.printf((char)27+"[33m"+"Counting up! The number is: %s\n",csy1.getNum());
                    jj--;
                }                
            }            
        }));
        t1.start();t2.start();
        // try{
        //     t1.join();
        //     t2.join();
        // }catch(InterruptedException e)
        // {
        //     System.out.println("The threads have been interrupted.");
        // }             
    }
    
}
