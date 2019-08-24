class upper implements Runnable
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
public class th6
{
	public static void main(String[] arg)
	{
		upper thread0 =new upper();
		Thread t0=new Thread(thread0);
		lower thread1 =new lower();
		Thread t1=new Thread(thread1);
		t0.start();
		t1.start();
	}
}