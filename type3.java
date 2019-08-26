class type3
{
	void method()
	{
		class inner
		{
			void inner_method()
			{
				System.out.println("Method inside inner class called");
			}
		}
		inner ob=new inner();
		ob.inner_method();
	}
	public static void main(String[] arg)
	{
		type3 ob=new type3();
		ob.method();
	}
}