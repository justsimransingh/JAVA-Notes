class type2
{
	private int z=100;
	class inner
	{
		inner()
		{
			System.out.println(z);
		}
	}
	public static void main(String[] arg)
	{
		type2 ob=new type2();
		type2.inner in_ob=ob.new inner();
	}
}
		