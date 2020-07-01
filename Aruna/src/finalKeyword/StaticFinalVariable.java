package finalKeyword;

public class StaticFinalVariable 
{
	private final static  int count;

	static//Static block Executed First before main Method
	{
		count=1;
		System.out.println("This is Static Block: " + count);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("This is Main Method " );
	}

}
