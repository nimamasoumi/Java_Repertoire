package Test.Threading;

public class CountDown implements Runnable {
    
    int cn;
    public CountDown(int N)
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
        System.out.printf("The count down thread %s has started.\n",this.cn);
        for (int i=num;i>0;i--)
        {
            try {
                System.out.printf("The counter #%s is %s\n",this.cn,i);            
                Thread.sleep(98);
                if (Thread.interrupted())
                {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.printf("The counter #%s is interrupted.\n",this.cn);
                e.printStackTrace();
            }
        }
    }
}
