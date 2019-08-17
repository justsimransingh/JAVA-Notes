class methods
{
	void fun()
	{
		System.out.println("zero argument function executed");
	}
	void fun(int a)
	{
		System.out.println("one argument function executed");
		System.out.println(a);
	}
	void fun(int a,int b)
	{
		System.out.println("two argument function executed");
		System.out.println(a+ " " +b);
	}
}
class overloading
{
public static void main(String[] args)
{
methods obj=new methods();
obj.fun();
obj.fun(1);
obj.fun(2,3);
}
}
