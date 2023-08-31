package Concepts.Threading;

public class CountAsync{
    int N;
    public CountAsync(final int _N)
    {
        N = _N;
    }
    public void CountDown()
    {
        N--;
    }
    public void CountUp()
    {
        N++;
    }
    public int getNum()
    {
        return N;
    }
}
