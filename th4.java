class upper extends Thread
{
	public void run()
	{
		for(char i=65;i<=90;i++)
		{
			System.out.println(i);
		}
	}
}
class lower extends Thread
{
	public void run()
	{
		for(char i=97;i<=122;i++)
		{
			System.out.println(i);
		}
	}
}
public class th4
{
	public static void main(String[] arg)
	{
		upper thread0 =new upper();
		lower thread1 =new lower();
		thread1.setName("Jai");
		thread0.start();
		thread1.start();
		while(thread0.isAlive())
		{
			System.out.println(thread0.getName());
		}
		while(thread1.isAlive())
		{
			
			System.out.println(thread1.getName());
		}
	}
}