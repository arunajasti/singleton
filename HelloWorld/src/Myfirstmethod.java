
public class Myfirstmethod {

	public static void main(String[] args) 
	{
		 Add(10,20);
         subtract(20,10);
         int result2=20;
         int multiply=result2*10;
         System.out.println("the multiply  is " + multiply );
 		
	}
	public static void Add(int a,int b)
	{
		//System.out.println("the sum of a and b  "+( a+b));
		int result=(a+b);
		System.out.println("the sum of a+b is " + result );
		
	}
	public static void subtract(int x,int y)
	{
		
		int result1=(x-y);
		System.out.println("the substact of x-y  is " + result1 );
	}

}
