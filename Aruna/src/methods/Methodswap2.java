package methods;

public class Methodswap2 {

	public static void main(String[] args)
	{
		int a=3;
		int b=2;
		System.out.println(" Before swapping: "+"a= " +a +" ,b=" +b);
		a=swap(b,b=a);//a=swap(2,3)
		System.out.println("After Swapping "+" a= " + a + ", b= " + b); 
}

private static int swap(int a, int b)//2,3
	{
		return a;//a=2
	}

}


