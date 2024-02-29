/**
 * Calculation of Euler number e
 * The user may specify the desired precision
 * The calculation is based on the taylor series approximation of 
 * the exponential function near 0
 * The values are calculate using Double and BigDecimal types
 */
package Concepts.MathFormula;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcEulerNum {
    
    private int precision =0;
    public CalcEulerNum(){};
    public CalcEulerNum(int _prec){
        this.precision=_prec;
    }
    public void setPrec(int _prec){
        this.precision = _prec;
    }
    public int getPrec(){
        return this.precision;
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
    public Double calcE(){
        int n = this.precision;
        Double ss=0.0;
        while(n>-1){
            ss += 1/fact(n);
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

    public BigDecimal calcEbd(){
        int n = this.precision;
        var ss=new BigDecimal("0.0");
        var nOne = BigDecimal.valueOf(1.0);
        ss.setScale(1000);
        while(n>-1){
            ss = ss.add(nOne.divide(factbd(n),1000, RoundingMode.DOWN));
            n--;
        }
        return ss;   
    }
    public static void main(String[] args){
        int prec = 19;
        Double numE = 0.0;
        var calcEuler = new CalcEulerNum(prec);
        numE = calcEuler.calcE();
        System.out.printf("\nThe Euler number with %d taylor series terms\n"+
        "By using Double is: \n%.19f\n"+
        "By using BigDecimal is: \n%s\n"+
        "The Euler number based on Java Math package is: \n%.19f\n",
        calcEuler.getPrec(),numE,calcEuler.calcEbd().toString(), Math.exp(1));
    }

}
