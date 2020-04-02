class excp 
{
	public static void main(String[] args) 
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
		}
		catch (Exception e)
		{
			System.out.println("plz check the exception");
		}
		System.out.println("give some other value");
	}
}
