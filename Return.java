class Return
{
	int sum(int a, int b)
	{
		return	a+b;
	}
	public static void main(String[] arg)
	{
		Return ob=new Return();
		System.out.print(ob.sum(2,3));
	}
}