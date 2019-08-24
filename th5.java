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
public class th5
{
	public static void main(String[] arg)
	{
		upper thread0 =new upper();
		lower thread1 =new lower();
		thread0.start();
		try
		{
			thread0.join();
		}
		catch(InterruptedException e)
		{}
		thread1.start();
	}
}