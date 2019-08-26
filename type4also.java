interface software
{
	void run();
	void window();
	void features();
}
public class type4also
{
	public static void main(String[] arg)
	{
		software ob=new software()
		{
			public void run()
			{
				System.out.println("Software Run....");
			}
			public void window()
			{
				System.out.println("software window open....");
			}
			public void features()
			{
				System.out.println("Software features....");
			}
		};
		ob.run();
		ob.window();
		ob.features();
	}
}
	