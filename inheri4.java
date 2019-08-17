class car
{
	public int ModelNo;
	public String Engine;
	car()
	{
		System.out.println("Start");
	}
	public void CarName(String N)
	{
		System.out.println(N);
	}
}
class upgrade extends car
{
	upgrade()
	{
		System.out.println("upgrade");
		super.ModelNo=123;
		System.out.println(super.ModelNo);
		super.CarName("Swift");
	}
}
class upgrade2 extends upgrade
{
	upgrade2()
	{
		System.out.println("upgrade2");
	}
}
public class inheri4
{
	public static void main(String[] arg)
	{
		new upgrade2();
	}
}