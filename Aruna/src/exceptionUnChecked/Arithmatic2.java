package exceptionUnChecked;

import java.util.Scanner;

public class Arithmatic2 
{
	public void add()
	{
		int data=15/0;
		System.out.println(data);
	}
	public static void User()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Name");
		String name=scan.next();
		System.out.println("Name is :" + name);
		
		System.out.println("Enter Age");
		int age=scan.nextInt();
		System.out.println("Age is : " + age);
		
		
		scan.close();
	}
public static void main(String args[])
{
	Arithmatic2 ar=new Arithmatic2();
	try{//outer try
		
	try{//first nested try
		ar.add();   //method invoked
		
		}catch(Exception e)
	{
		System.out.println(e);
		System.out.println("first Nested try add method ");
	}
	try{// second nested try
		User();//Method invoked
		
	}catch(Exception e)
	{
		System.out.println(e);
		System.out.println("second Nested try User method");
	}
	}//outer try brace closed here
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("Outer Try");
	}finally{
		System.out.println("Finally block always Executed");
	}
}
}
