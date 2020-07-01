package methodOverloading;

public class MethodOverloading3 
{
	public static void main(String args[])
	{
		SubOverloading3 sub=new SubOverloading3();
		sub.add(2, 3);
		sub.add(1, 2, 3);
				
		int result=sub.subtract(10, 5);
		System.out.println("Superclass INT subtract(): " + result);
	
		float result1=sub.subtract(10, 5);
		System.out.println("Subclass FLOAT subtract(): " + result1);
		
		
	}
}
