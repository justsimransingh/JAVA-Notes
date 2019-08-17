import java.util.Scanner;
class opeex2
{
	public static void main(String[] args)
	{	
		System.out.println("Are you above 18?");
		System.out.println("Enter your age");
		int age=new Scanner(System.in).nextInt();
		boolean a=age>18?true:false;
		System.out.println(a);
	}
}