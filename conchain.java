class conchain
{
	conchain()
	{
		this(1,2);
		System.out.println("Default constructor called!");
	}
	conchain(int x,int y)
	{
		this(1,2,3);
		System.out.println("two arg constructor called! with arg value  "+ x + y );
	}
	conchain(int x,int y,int z)
	{
		System.out.println("three arg constructor called! with arg value  "+ x + y + z );
	}
	public static void main(String[] args)
	{
		new conchain();
	}
}