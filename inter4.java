interface Printable
{  
	void print();  
}  
interface Showable
{  
	void show();  
}  
class inter4 implements Printable,Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
	}  
	public static void main(String args[])
	{  
		inter4 obj = new inter4();  
		obj.print();  
		obj.show();  
	}  
}  