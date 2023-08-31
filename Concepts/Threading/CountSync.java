package Concepts.Threading;

public class CountSync{
    int N;
    public CountSync(final int _N)
    {
        N = _N;
    }
    public synchronized void CountDown()
    {
        N--;
    }
    public synchronized void CountUp()
    {
        N++;
    }
    public int getNum()
    {
        return N;
    }
}
