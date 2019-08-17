class variable2
{
	int instance_variable;
	static int static_variable;
	void method()
	{
		int local_variable=99;
		System.out.println(local_variable);
	}
	public static void main(String [] args)
	{
		variable ob=new variable();
		ob.instance_variable=999;
		System.out.println(ob.instance_variable);
		variable.static_variable=100;
		System.out.println(variable.static_variable);
		ob.method();
	}
}