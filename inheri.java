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
		System.out.println("Upgrade");
	}
}
public class inheri 
{
	public static void main(String[] arg)
	{
		new upgrade();
	}
}