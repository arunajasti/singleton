package methods;

public class Method2 {

	public static void main(String[] args)
	{

int a=3;
int b=2;
		addsum(a,b);//passing by value
//a and b are original variables and value cannot ba changed

	}
//i & j are copy variables of a & b.we can modify the i and j values
	private static void addsum(int i, int j) //void it cannot return so call s.o.pln//the method return nothing
	{
	i=i+2;//i=a;i=2+2;i=4//the original 'a' value is not change just modifying
		int add=i+j;//4+3=7//
		System.out.println("add i + j is: " +add);
		
	}

}
