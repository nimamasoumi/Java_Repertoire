package Test.Threading;

public class MultiThreading {
    public static void main(String args[])
    {
        int N =0;
        CountDown cdown1 = new CountDown(++N);
        cdown1.SetNum(38);

        CountDown cdown2 = new CountDown(++N);
        cdown2.SetNum(19);

        Thread t1 = new Thread(cdown1);
        t1.setName("Counter1");        
        Thread t2 = new Thread(cdown2);
        t2.setName("Counter2");

        t1.start();
        t2.start();
        
        try {
            t1.join(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Testing join command!");
    }
}
