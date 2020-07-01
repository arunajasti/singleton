package exceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowExample1
{
	public void method(int age)throws InputMismatchException,NumberFormatException
	{
		if(age>=18 && age<=59)
		{
			throw new NumberFormatException("Valid for vote");
		}
			else
				throw new InputMismatchException("Invalid for vote");
		}
	}
	
public class ThrowsUnchecked {

	public static void main(String[] args) {
	ThrowExample1 th=new ThrowExample1();	
Scanner scan=new Scanner(System.in);
System.out.println("Enter age");

try
{
	int age=scan.nextInt();
	th.method(age);
}catch(Exception e)
{
	System.out.println(e);
	}
System.out.println("Successfully handled");
scan.close();

	}

}
