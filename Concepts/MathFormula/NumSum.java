package Concepts.MathFormula;
public class NumSum implements INumberSum
{
	private long valN = 0L;

	public NumSum(){}
	public long getN()
	{
		return this.valN;
	}
	public void resetN()
	{
		this.valN = 0L;
	}
	public void accuN(long _n)
	{
		long ii = _n;
		resetN();
		while (ii>0)
		{
			this.valN += ii;
			ii--;
		}
	}
			
	
	@Override
	public double sumOfN(long _n)
	{
		double nn = _n*(_n+1);
		return nn/2;
	}

	public static void main(String[] args)
	{
		var c4 = new NumSum();
		long[] N = {2, 7, 13, 19};
		double nn =0;
		for (int i=0; i< N.length; i++)
		{
		nn = c4.sumOfN(N[i]);
		c4.accuN(N[i]);
		System.out.printf("\nN is %d and %d %f\n", N[i], c4.valN, nn);	
		}
	}
}
