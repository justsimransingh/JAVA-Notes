abstract class basic
{
	void basicfunction()
	{
		System.out.println("basic function");
	}
}
public class abs2 extends basic
{
	public static void main(String[] arg)
	{
		//abs2 ob=new basic();                               (shows error)
		basic ob=new abs2();
		ob.basicfunction();
	}
}