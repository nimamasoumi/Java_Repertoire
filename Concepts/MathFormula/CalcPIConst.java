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

    public BigDecimal calcPIbd(){
        int n = this.getPrec();
        Double ss=0.0, num = 0.0, pol=0.0, dnum=0.0;
        var sss = new BigDecimal("0.0");
        sss.setScale(1000);
        while(n>-1)
        {
            pol = Math.pow(0.5, 1+(2*n));
            num=fact(n+n);
            dnum = Math.pow(4,n)*(1+(2*n))*Math.pow(fact(n), 2);
            ss = (6*num*pol)/dnum;
            sss = sss.add(new BigDecimal(ss));
            n--;
        }
        return sss;
    }

    public static void main(String[] args)
    {
        int prec = 71;
        var calcPI = new CalcPIConst(prec);

        System.out.printf("\nThe PI value using %d taylor series terms is:\n"+
        "%.19f\n"+"The PI constant according to Java Math package is:\n"+"%.19f\n"+
        "Using the BigDecimal to accumulate the value:\n"+"%s\n",
        calcPI.getPrec(),calcPI.calcPI().doubleValue(),Math.PI, calcPI.calcPIbd().toString());
    }
}