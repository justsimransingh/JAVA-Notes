class parent
{
	parent()
	{
		System.out.println("Parent class constructor called");
	}
}
class child extends parent
{
	child()
	{
		super();
		System.out.println("Child class constructor called");
	}
}
class super3
{
	public static void main(String[] arg)
	{
		new child();
	}
}