/**
 * Calculation of the constant PI
 * The user may specify the desired precision
 * The calculation is based on the taylor series approximation of 
 * the inverse cosine near 0
 * The values are calculate using Double and BigDecimal types
 */

package Concepts.MathFormula;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
            return BigDecimal.valueOf(1.0);
        }        
        var n=(double)_n;

        // similar to new BigDecimal("1.0");
        var mm = BigDecimal.valueOf(1.0);
        mm.setScale(1000);
        while (n>0)
        {
            mm = mm.multiply(BigDecimal.valueOf(n));
            n=n-1;
        }
        return mm;
    }

    // In this method, double and Double are not used
    public BigDecimal calcPIbd(){
        int n = this.getPrec();        
        var sss=BigDecimal.valueOf(0.0);
        var pol=BigDecimal.valueOf(0.5);
        var num=BigDecimal.valueOf(0.0);
        var dnum=BigDecimal.valueOf(0.0);
        var dnum2=BigDecimal.valueOf(0.0);
        var dnum3=BigDecimal.valueOf(0.0);
        var dnum4=BigDecimal.valueOf(0.0);
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
            sss = sss.add(num.divide(dnum, 1000, RoundingMode.DOWN));
            n--;
            pol= BigDecimal.valueOf(0.5);
        }
        return sss;
    }

    public static void main(String[] args)
    {
        int prec = 1000;
        var calcPI = new CalcPIConst(prec);
        var piStr = calcPI.calcPIbd().toString();
        var piStrD = piStr.substring(2);
        var dP = piStrD.length();
        while(dP>10){
            piStrD = new StringBuilder(piStrD).insert(dP-10,',').toString();
            dP=dP-10;
        }        
        //System.out.println(piStrD);

        System.out.printf("\nThe PI value using %d taylor series terms is:\n"+
        "%.19f\n"+"The PI constant according to Java Math package is:\n"+"%.19f\n"+
        "Using the BigDecimal to accumulate the value:\n"+"3.%s\n",
        calcPI.getPrec(),calcPI.calcPI().doubleValue(),Math.PI, piStrD);

        //System.out.println(calcPI.factbd(prec));
    }
}