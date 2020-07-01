package exception;



import java.util.InputMismatchException;
import java.util.Scanner;

// when using Scanner class to give wrong values (for int datatype we give double value)throws 
//the Mismatch Exception
public class Mismatch {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Values of a and b");
		try{
int a=scan.nextInt();
int b=scan.nextInt();
int c=a/b;
System.out.println("tha value of c is  " +c);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
System.out.println("Program run successfully");
		}
		scan.close();

	}

}
