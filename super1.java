class parent
{
	String name="parent";
}
class child extends parent
{
	String name="child";
	void className()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
class super1
{
	public static void main(String[] arg)
	{
		child obj=new child();
		obj.className();
	}
}