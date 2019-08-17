class l_break
{
	public static void main(String[] args)
	{
		first : for(int i=1;i<4;i++)
		{	
			for(int j=3;j>0;j-- )
			{
				if(i==2 && j==2)
				{
					break first;
				}
				System.out.println( i +"    " + j );
			}
		}
	}
}
			