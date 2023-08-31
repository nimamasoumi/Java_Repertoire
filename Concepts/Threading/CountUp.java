package Concepts.Threading;

public class CountUp implements Runnable {
    
    int cn;
    public CountUp(int N)
    {
        cn =N;
    }
    int num;

    public void SetNum(final int nm)
    {
        this.num = nm;
    }
    public int GetNum()
    {
        return this.num;
    }
    
    public void run ()
    {
        System.out.printf("The count up thread %s has started.\n",this.cn);
        for (int i=1;i<=num;i++)
        {
            try {
                System.out.printf("The up counter #%s is %s\n",this.cn,i);            
                Thread.sleep(101);
                if (Thread.interrupted())
                {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.printf("The up counter #%s is interrupted.\n",this.cn);
                e.printStackTrace();
            }
        }
    }
}
