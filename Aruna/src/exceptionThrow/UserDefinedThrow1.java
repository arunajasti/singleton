/*package exceptionThrow;

import java.util.Scanner;

//User defined exception needs to inherit (extends) Exception class in order to act as an exception.
//throw keyword is used to throw such exceptions.
class Wrongdata extends Exception
{
	public void studentinfo(int age,int grade)
	{
		if(age<=14 && grade<=10 )
		{
			try{
				throw new Wrongdata();
			} catch (Wrongdata e) {
				System.out.println(e);
				
			}
		}
		else
			System.out.println("Valid for Test");
	}
	}
class UserDefinedThrow1
{
public static void main(String args[])
{
	Wrongdata ex=new Wrongdata();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Age");
	int a=scan.nextInt();
	System.out.println("Enter the Grade");
	int g=scan.nextInt();
	ex.studentinfo(a,g);
	scan.close();
	}
}*/