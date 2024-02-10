/**
 * Provides methods to calculate sum of natural numbers powered by a positive integer
 * The power can be greater than zero 
 * <code> long </code> type was used to store the results
 * Therefore, the summation is bounded by the supported range (64 bits)
 */
public class PowerSum extends CubicSum
{
    /**
     * @param pp is the power in the summation
     */
    private long pp =0;
    
    public PowerSum(){}

    /**
     * @param _num this parameter defines the summation range
     */
    public PowerSum(long _num)
    {
        super(_num);
    }
    public PowerSum(long _num, long _pp)
    {
        super(_num);
        this.pp = _pp;
    }
    public long getPower()
    {
        return this.pp;
    }
    public void setPower(long _pp)
    {
        this.pp = _pp;        
    }
    public long accuNP(long _num, long _pp)
    {
        long n = _num, ss=0;
        while (n>0)
        {
            ss += (long) Math.pow((double) n,(double) _pp);
            n--;
        }
        return ss;
    }
    public long accuNP()
    {
        return accuNP(this.getNum(), this.getPower());        
    }

    public static void main(String[] args)
    {
        if (args.length<2)
        {
            System.out.println("Not enough input arguments!"+
            "Usage: PowerSum N P"+
            "e,g,: PowerSum 8 3");
            return;
        }
        
        var n = Long.parseLong(args[0], 10);
        var p = Long.parseLong(args[1], 10);
        var pSum = new PowerSum(n, p);
        System.out.printf("\nThe number and power are: %d and %d\n"+
        "The sum by accumulation is: %d\n", 
        pSum.getNum(), pSum.getPower(), pSum.accuNP());   
    }    
    
}
