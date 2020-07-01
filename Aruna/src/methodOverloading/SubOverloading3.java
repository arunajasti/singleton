package methodOverloading;

public class SubOverloading3 extends SuperOverloading3
{
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("subclass (a+b+c) = " +d);
	}
	public float subtract(float a,float b)
	{
		float c=a-b;
		return c;
		
	}
}
