package exception;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a/b;// if we give b value 0(zero)it raise the Arithmatic Exception
		//so we can use try and catch block
		System.out.println("The value of c is.."+c);
	System.out.println("Program run Successfully..");
	scan.close();
	
	}
}
