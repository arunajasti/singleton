package methods;

public class Methodswap1 {

	public static void main(String[] args)
	{
int a=3;
int b=2;
swap(a,b);
System.out.println("after method invoke check the values a & b is it swap or not "+"a= " +a+" , "+"b= "+b);
	}

	private static void swap(int a, int b)
	{
		System.out.println(" Before swapping: "+"a= " +a +" ,b=" +b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" After swapping: "+"a= " +a +" ,b=" +b);
		
	}

}
