interface bot
{
	void run();
	void fire();
}
class type4 
{
	public static void main(String[] arg)
	{
		new bot()
		{
			public void run()
			{
				System.out.println("Run method executed");
			}
			public void fire()
			{
				System.out.println("Fire method executed");
			}
		}.run(); //same for fire 
		
	}
}