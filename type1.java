class type1
{
	static private int z=90;
	static class inner
	{
		inner()
		{
			System.out.println(z);
		}
	}
	public static void main(String [] args)
	{
		type1.inner ob=new inner();
	}
}