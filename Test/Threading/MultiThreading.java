package Test.Threading;

public class MultiThreading {
    public static void main(String args[])
    {
        int N =0;
        CountDown cdown1 = new CountDown(++N);
        cdown1.SetNum(19);

        CountDown cdown2 = new CountDown(++N);
        cdown2.SetNum(13);

        (new Thread(cdown1)).start();
        (new Thread(cdown2)).start();
    }
}
