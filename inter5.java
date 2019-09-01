interface Drawable
{  
	void draw();  
	default void msg()
	{
		System.out.println("default method");
	}  
	static int cube(int x)
	{
		return x*x*x;
	} 
}  
class Rectangle implements Drawable
{  
	public void draw()
	{	
		System.out.println("drawing rectangle");
	}  
}  
class inter5
{  
	public static void main(String args[])
	{  
		Drawable d=new Rectangle();  
		d.draw();  
		d.msg();  
		System.out.println(Drawable.cube(3));  
	}
}  