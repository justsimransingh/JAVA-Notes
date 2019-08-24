class parent
{
	void method()
	{
		System.out.println("Parent class method called");
	}
}
class child extends parent
{
	void method()
	{
		super.method();
		System.out.println("child class method called");
	}
}
class super2
{
	public static void main(String[] arg)
	{
		child obj=new child();
		obj.method();
	}
}