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
public class th1
{
	public static void main(String[] arg)
	{
		upper thread0 =new upper();
		thread0.start();
		lower thread1 =new lower();
		thread1.start();
	}
}

