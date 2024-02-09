/**
 * Provides methods to calculate sum of natural numbers powered by natural numbers
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
    
}
