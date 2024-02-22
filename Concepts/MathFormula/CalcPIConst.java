/**
 * Calculation of the constant PI
 * The user may specify the desired precision
 * The calculation is based on the taylor series approximation of 
 * the inverse cosine near 0
 * The values are calculate using Double and BigDecimal types
 */

package Concepts.MathFormula;

import java.math.BigDecimal;

public class CalcPIConst extends CalcEulerNum{
    public CalcPIConst(){};
    public CalcPIConst(int _prec){
        super(_prec);
    }

    public Double calcPI(){
        int n = this.getPrec();
        Double ss=0.0, num = 0.0, pol=0.0, dnum=0.0;
        while(n>-1)
        {
            pol = Math.pow(0.5, 1+(2*n));
            num=fact(n+n);
            dnum = Math.pow(4,n)*(1+(2*n))*Math.pow(fact(n), 2);
            ss += (6*num*pol)/dnum;
            n--;
        }
        return ss;
    }

    public BigDecimal factbd(int _n){
        if(_n==0)
        {
            return new BigDecimal("1.0");
        }        
        var n=(double)_n;
        var mm = new BigDecimal("1.0");
        mm.setScale(1000);
        while (n>0)
        {
            mm = mm.multiply(new BigDecimal(n));
            n=n-1;
        }
        return mm;
    }

    public BigDecimal calcPIbd(){
        int n = this.getPrec();        
        var sss=new BigDecimal("0.0");
        var pol=new BigDecimal("0.5");
        var num=new BigDecimal(0.0);
        var dnum=new BigDecimal(0.0);
        var dnum2=new BigDecimal(0.0);
        var dnum3=new BigDecimal(0.0);
        var dnum4=new BigDecimal(0.0);
        sss.setScale(1000);
        while(n>-1)
        {
            pol = pol.pow(1+(n+n));
            num=factbd(n+n);
            num=num.multiply(pol);
            num=num.multiply(BigDecimal.valueOf(6.0));
            dnum2= factbd(n);
            dnum3 = BigDecimal.valueOf(4.0);
            dnum3=dnum3.pow(n);
            dnum4 = BigDecimal.valueOf(1+(2*n));
            dnum = dnum3.multiply(dnum4.multiply(dnum2.pow(2)));            
            sss = sss.add(num.divide(dnum));
            n--;
            pol= BigDecimal.valueOf(0.5);
        }
        return sss;
    }

    public static void main(String[] args)
    {
        int prec = 19;
        var calcPI = new CalcPIConst(prec);

        System.out.printf("\nThe PI value using %d taylor series terms is:\n"+
        "%.19f\n"+"The PI constant according to Java Math package is:\n"+"%.19f\n"+
        "Using the BigDecimal to accumulate the value:\n"+"%s\n",
        calcPI.getPrec(),calcPI.calcPI().doubleValue(),Math.PI, calcPI.calcPIbd().toString());

        System.out.println(calcPI.factbd(prec));
    }
}