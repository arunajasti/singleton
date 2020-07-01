package scanner;

import java.util.Scanner;

//import java.util.Scanner;//import Scanner class which is in util folder inside the java folder.

/*
 what a package is?
In java, packages are the container for classes and whenever we want to use the features of another classes that are defined in another package,
 we use import keyword.
 what java.util.Scanner means !!

util :stands for utility and contains utility classes. 
Scanner : is a predefined class for taking inputs from user.*/
public class UserInput {

	public static void main(String[] args)
	{
		int[] a=new int[5];

		Scanner input=new Scanner(System.in);	//getting input from user
		System.out.println("enter the values");
		for(int i=0;i<5;i++)//this for loop is put all values in array
		{
			a[i]=input.nextInt();//put the input values in an array
		}
		System.out.println("given values");
		for(int i=0;i<5;i++)//this for loop is print the values
		{
			System.out.println( " "+a[i]);

		}
		input.close(); //close the scanner otherwise it gives warning
		                        //The problem comes in because I have other classes in the same package 
		                        //that also use scanner objects and and Eclipse tells me to close scanner in those classes respectively.

	}
}


