package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllUnchecked {

	public static void main(String[] args)
	{
              int a, b, c;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=scan.nextInt();
		b=scan.nextInt();
		try{
		c=a/b;
		System.out.println("The value of c is.."+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	
		
System.out.println("Program run successfully");
scan.close();
	}

}

