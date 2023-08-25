package Test.Threading;

public class MultiThreading {
    public static void main(String args[])
    {
        int N =0, M=0, jj=30;
        CountDown cdown1 = new CountDown(++N);
        cdown1.SetNum(38);

        CountDown cdown2 = new CountDown(++N);
        cdown2.SetNum(19);

        CountUp cup1 = new CountUp(++M);
        cup1.SetNum(13);

        Thread t1 = new Thread(cdown1);
        t1.setName("Counter1");        
        Thread t2 = new Thread(cdown2);
        t2.setName("Counter2");

        
        Thread t3 = new Thread(cup1);
        t3.setName("UpCounter1");

        t1.start();
        t2.start();
        t3.start();

        while(t3.isAlive())
        {
            System.out.printf((char)27+"[%sm",jj);
            jj++;
        }
        t2.interrupt();
        
        try {
            t1.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Testing join command!");
    }
}
