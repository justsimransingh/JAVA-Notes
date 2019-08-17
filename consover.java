class consover
{
	consover()
	{
		System.out.println("Default constructor called!");
	}
	consover(int x,int y)
	{
		System.out.println("two arg constructor called! with arg value  "+ x + y );
	}
	consover(int x,int y,int z)
	{
		System.out.println("three arg constructor called! with arg value  "+ x + y + z );
	}
	public static void main(String[] args)
	{
		new consover();
		new consover(1,2);
		new consover(1,2,3);
	}
}