package intarface;



	interface Arithmetic
	{
		public void addition(int a,int b);
	}

	interface NewArithmetic
	{
		public void subtraction(int a,int b);
	}

	class Maths1
	{
		public void multiplication(int a,int b)
		{
			System.out.println("The multiplication is:"+(a*b));
		}
	}

	class Calculate1  extends Maths1 implements Arithmetic,NewArithmetic
	{

		@Override
		public void subtraction(int a, int b) 
		{
			System.out.println("The subtraction is:"+(a+b));		
		}

		@Override
		public void addition(int a, int b) 
		{
			System.out.println("The addition is:"+(a+b));
		}
	}

	public class InterfaceDemo2 {

		public static void main(String[] args) 
		{
			Calculate1 calculate=new Calculate1();
			calculate.addition(9, 5);
			calculate.subtraction(9, 5);
			calculate.multiplication(9, 5);
			
			
			

		}
	}



