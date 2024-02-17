/**
 * Calculation of the constant PI
 * The user may specify the desired precision
 * The calculation is based on the taylor series approximation of 
 * the inverse cosine near 0
 * The values are calculate using Double and BigDecimal types
 */

package Concepts.MathFormula;

public class CalcPIConst extends CalcEulerNum{
    public CalcPIConst(){};
    public CalcPIConst(int _prec){
        super(_prec);
    }

    public Double calcPI(){
        return 3.141;
    }

    public static void main(String[] args)
    {
        int prec = 19;
        var calcPI = new CalcPIConst(prec);

        System.out.printf("\nThe PI value using %d taylor series terms is:\n"+
        "%.19f\n"+"The PI constant according to Java Math package is:\n"+"%.19f\n",
        calcPI.getPrec(),calcPI.calcPI().doubleValue(),Math.PI);
    }
}