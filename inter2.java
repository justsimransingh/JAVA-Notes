interface Jarvis
{
	int a=56;
	void cpuName();
}
public class inter2 implements Jarvis
{
	public void cpuName()
	{
		System.out.println("Hello");
	}
	public static void main(String[] arg)
	{
		inter2 ob=new inter2();
		System.out.println(ob.a);
		ob.cpuName();
	}
}