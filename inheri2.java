class car
{
	public int ModelNo;
	public String Engine;
	car()
	{
		System.out.println("Start");
	}
}
class upgrade extends car
{
	upgrade()
	{
		System.out.println("upgrade");
		super.ModelNo=123;
		System.out.println(super.ModelNo);
	}
}
public class inheri2
{
	public static void main(String[] arg)
	{
		new upgrade();
	}
}