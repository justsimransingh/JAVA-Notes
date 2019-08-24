class task
{
	void myTask(int j)
	{
		for(int i=1;i<11;++i)
		{
			System.out.println(i*j);
		}
	}
}
class actualTask extends Thread
{
	task t;
	actualTask(task t)
	{
		this.t=t;
	}
	public void run()
	{
		t.myTask(3);
	}
}
class actualTask2 extends Thread
{
	task t;
	actualTask2(task t)
	{
		this.t=t;
	}
	public void run()
	{
		t.myTask(5);
	}
}
public class th7
{
	public static void main(String[] atg)
	{
		task t1=new task();
		actualTask a1=new actualTask(t1);
		actualTask2 a2=new actualTask2(t1);
		a1.start();
		a2.start();
	}
}