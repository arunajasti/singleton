package exceptionUnChecked;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values");
		try{
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int add=num1+num2;
		System.out.println("addition is " + add);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		scan.close();

	}

}
