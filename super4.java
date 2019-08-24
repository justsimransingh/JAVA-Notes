class student
{
	int rollno;
	String name;
	student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}
class place extends student
{
	String college;
	place(int rollno,String name,String college)
	{
		super(rollno,name);
		this.college=college;
	}
	void show()
	{
		System.out.println(rollno + "  " + name + "  " + college );
	}
}
class super4
{
	public static void main(String[] args)
	{
		new place(38,"Simran","JECRC").show();
	}
}
	
		