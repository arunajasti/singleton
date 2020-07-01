package exceptionThrow;
//pre defined exception by using Throw keyword
import java.util.Scanner;

class Tenthexam
{
	public void studentinfo(int age,int grade)
	{
		if(age<=14 && grade<=10 )
		{
			throw new IllegalArgumentException("Not valid for Test");//not use try /catch insteadof using catch the exception 
			                                                                                              //here i'm using throw keyword to throw an exception.
		}
		else
			System.out.println("Valid for Test");
	}
	}
public class PreDefinedThrow1 {

	public static void main(String[] args) 
	{
		Tenthexam ex=new Tenthexam();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		int a=scan.nextInt();
		System.out.println("Enter the Grade");
		int g=scan.nextInt();
	try
	{
	ex.studentinfo(a,g);
	}catch(Exception e)
	{
		System.out.println(e);
		System.out.println("successsfully execution");
	}
		scan.close();
		

	}

}
