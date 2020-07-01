package exceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		int a[]=new int[5];
		try
		{
			try{
				a[4]=10/0;//Arithmatic exception arises
				System.out.println("divide by zero: " + a[4]);
			}catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Inside Try Block of Arithmatic Exception");
			}
			try{
				a[5]=20;
				System.out.println("Array index out of bounds " + a[5]);

			}catch(Exception e)
			{
				System.out.println(e);	
				System.out.println("Array Index out of bounds ");
			}
		}catch(Exception e)//outside try block brace
		{
			System.out.println(e);
		}
		System.out.println("Normal flow of program");
	}

}
