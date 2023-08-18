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
        System.out.printf("The count down thread %s has started",this.cn);
        for (int i=num;i>0;i--)
        {
            System.out.printf("The counter #%s is %s\n",this.cn,i);
            try {
                Thread.sleep(313);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
