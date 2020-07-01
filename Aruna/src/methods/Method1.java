package methods;
//here using 1 class values passby method
public class Method1 {
	private static int addsum(int i, int j)//method type is int and return int value//method return a value
	{
		int add=i+j;
		return add;
		
		
	}
	public static void main(String[] args) 
	{
	int a=3;
	int b = 2;
	
	//Method1 m1=new Method1(); if the addsum() is not static then we create an object
	//int c=m1.addsum(a,b);//invoking(calling) method
	
	int c=addsum(a,b);
System.out.println("Ad;d a+b is: " +c);
	}

	

}
