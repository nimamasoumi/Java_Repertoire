package Concepts.MathFormula;
public class CubicSum extends SqrSum
{
	public CubicSum(){};
	public CubicSum(long _num)
	{
		super(_num);
	}

	public long sumOfN3(long _n)
	{
		var n= (double) _n;
		var ss = (long) Math.pow(n*(n+1),2)/4;
		return ss;
	}
	public long sumOfN3()
	{
		return sumOfN3(this.getNum());
	}
	public long accuN3(long _n)
	{
		long n = _n, ss=0;
		while (n>0)
		{
			ss += (long) Math.pow(n, 3);
			n--;
		}
		return ss;
	}
	public long accuN3()
	{
		return accuN3(this.getNum());
	}

	public static void main(String[] args)
	{
		if(args.length<1)
		{
			System.out.println("Not enought input argument!"+
			"\nUsage: Class6 N e.g. Class6 46");
			return;
		}
		
		long n = Long.parseLong(args[0], 10);
		var clss6 = new CubicSum(n);
		System.out.printf("\nThe value of N is: %d"+
				"\nSum of cubes are: %d and %d\n",
				clss6.getNum(), clss6.sumOfN3(), clss6.accuN3());		
	}
}
	
