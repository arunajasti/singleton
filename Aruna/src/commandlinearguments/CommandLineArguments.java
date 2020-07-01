package commandlinearguments;

import java.util.Scanner;

public class CommandLineArguments {

	public static void main(String[] args)
	{
		int[] number=new int[3];

		System.out.println("enter the values");
		for(int i=0;i<3;i++)
		{
			number[i] =Integer.parseInt(args[i])	;	
			System.out.println(number[i]);
		}
		//using scanner class
		Scanner scan=new Scanner(System.in);// when we use scanner class we use 2 for loops

		System.out.println("enter the values");//this for loop for enter the values in an array
		for(int i=0;i<3;i++)
		{
			number[i] =scan.nextInt();	
		}

		System.out.println("print the values");
		for(int i=0;i<3;i++)// this for loop for print values 
		{
			System.out.println(number[i]);
		}
		scan.close();
	}

}
