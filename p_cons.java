class p_cons
{
	p_cons(int x)
	{
		System.out.println("Parameterized constructor called! with arg value  "+ x );
	}
	public static void main(String[] args)
	{
		new p_cons(4);
	}
}