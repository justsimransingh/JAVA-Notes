class variable
{
	int instance_variable=50;
	static int static_variable=100;
	void method()
	{
		int local_variable=99;
		System.out.println(local_variable);
	}
	public static void main(String [] args)
	{
		variable ob=new variable();
		System.out.println(ob.instance_variable);
		System.out.println(variable.static_variable);
		ob.method();
	}
}