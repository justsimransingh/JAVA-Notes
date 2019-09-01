//Example of an abstract class that has abstract mathod
abstract class shape
{
	abstract void draw();
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("Draws a rectangle");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("Draws a circle");
	}
}
class abs3
{
	public static void main(String [] args)
	{
		shape s;
		s=new circle();
		s.draw();
		s=new rectangle();
		s.draw();
	}
}