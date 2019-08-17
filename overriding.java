class first
{
	void fun1(int a,int b)
	{
		int z;
		System.out.println("executed from first class function...Sum of the arguments is");
		z=a+b;
		System.out.println(z);
	}
}
class second extends first
{
	void fun2(int a,int b,int c)
	{
		int x;
		System.out.println("executed from second class function...Sum of the arguments is");
		x=a+b+c;
		System.out.println(x);
	}
}
class overriding extends second
{
	public static void main(String[] args)
	{
		overriding ob = new overriding();
		ob.fun1(2,3);
		ob.fun2(1,2,3);
	}
}