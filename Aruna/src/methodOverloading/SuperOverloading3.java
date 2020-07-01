package methodOverloading;

public class SuperOverloading3
{
	public void add(int a,int b)//same name different parameters
	{
		int c=a+b;
		System.out.println("super class (a+b)= " +c);
	}
	public int subtract(int a,int b)//same parameters but different data type
	{
		int c=a-b;
		return c;
		
	}

}
