/**
 * Generic type implementation of PowerSum class in this package
 * This class allows the calculations in BigDecimal, BigInteger, and Long
 * Provides methods to calculate sum of natural numbers powered by a positive integer
 * The power can be greater than zero 
 */

 import java.util.List;
 import java.util.ArrayList;

public class GenPowerSum<T> {

    /**
     * @param pp is the power in the summation
     * @param num is the upper bound number of summation
     */
    private long pp = 0;
    private long num = 0;
    
    public GenPowerSum(){}

    /**
     * @param _num this parameter defines the summation range
     */
    public GenPowerSum(long _num)
    {
        this.num = _num;
    }
    public GenPowerSum(long _num, long _pp)
    {
        this.num = _num;
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
    public long getNum()
    {
        return this.num;
    }
    public void setNum(long _num)
    {
        this.num=_num;
    }
    public T accuNP(long _num, long _pp)
    {        
        long n = _num;
        T ss=null;
        while (n>0)
        {
            if (n==_num)
            {
                ss = (T) Math.pow((double) n,(double) _pp);
            }
            else
            {
                ss += (T) Math.pow((double) n,(double) _pp);
            }            
            n--;
        }
        return ss;
    }
    public long accuNP()
    {
        return accuNP(this.getNum(), this.getPower());        
    }

    public double fact(int _n)
    {
        if(_n==0)
        {
            return 1.0;
        }        
        double mm =1, n=(double)_n;
        while (n>0)
        {
            mm = n*mm;
            n--;
        }
        return mm;
    }

    public long sumNP(long _num, long _pp)
    {
        var ss = new ArrayList<Long>();
        ss.add(_num);
        var np =(int) _pp;
        int kk = 1;
        double tSum=0, aSum = 0;
        while (kk<np+1)
        {
            for(int ii=0; ii<kk; ii++)
            {
                aSum += (this.fact(kk+1)/(this.fact(kk+1-ii)*this.fact(ii)))
                        *(double)ss.get(ii);
            }
            tSum = (Math.pow((double)_num+1,(double)kk+1)-1-aSum)/((double)kk+1);
            ss.add((long) tSum);
            //System.out.printf("\nIntermediate result: %d %f %d\n", kk, aSum, ss.get(kk));
            kk++;
            aSum=0;
        }

        return ss.get(np).longValue();
    }
    public long sumNP()
    {
        return sumNP(this.getNum(), this.getPower());
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

        if (p<1)
        {
            System.out.println("The power should be equal or bigger than 1.");
            return;
        }

        var pSum = new PowerSum(n, p);
        System.out.printf("\nThe number and power are: %d and %d\n"+
        "The sum by accumulation is: %d\n"+ 
        "The sum using the closed form: %d\n",
        pSum.getNum(), pSum.getPower(), pSum.accuNP(), pSum.sumNP());   
    }    
    
}

