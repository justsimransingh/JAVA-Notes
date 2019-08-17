class wloop
{
	public static void main(String[] args)
	{
		int num=1345;
		int count=0;
		while(num>0)
		{
			++count;
			num=num/10;
		}
		System.out.print("Number of digits are-" + count);
	}
}
