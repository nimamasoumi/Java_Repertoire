public class SqrSum implements ISquareSum
{
	
	private long num = 0;

	public SqrSum(){};
	public SqrSum(long _num)
	{
		this.num=_num;
	}
	
	public void setNum(long _num)
	{
		this.num = _num;
	}
	public long getNum()
	{
		return this.num;
	}

	@Override
	public long sumOfN2(long _n)
	{
		double n = _n*(_n+1)*((2*_n)+1);
		return (long) n/6;
	}
	public long sumOfN2()
	{
		return this.sumOfN2(this.num);
	}

	public long accuN2(long _n)
	{
		long n = _n, N=0;
		while(n>0)
		{
			N += (long) Math.pow((double)n,2.0);
			n--;
		}
		return N;
	}
	public long accuN2()
	{
		return this.accuN2(this.num);
	}

	public static void main(String[] args)
	{
		long n = Long.parseLong(args[0], 10);
		var clss5 = new SqrSum(n);

		System.out.printf("\nThe value of N is: %d "+
					"\nSums are %d %d\n", clss5.getNum(), clss5.sumOfN2(), clss5.accuN2());
	}
}
