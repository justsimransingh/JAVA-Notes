class unbreak
{
	public static void main(String[] args)
	{
		for(int i=1;i<4;i++)
		{	
			for(int j=3;j>0;j-- )
			{
				if(i==2 && j==2)
				{
					break;
				}
				System.out.println( i +"    " + j );
			}
		}
	}
}
	
			