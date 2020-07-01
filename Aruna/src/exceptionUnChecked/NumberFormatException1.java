package exceptionUnChecked;

import java.util.Scanner;

public class NumberFormatException1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many times");
		int times=scan.nextInt();
		
		int temp=0;
		try{
			while(temp<times)
			{
				System.out.println("Enter the values"); //there is apossible to get Number format exception if we give string values instaed of integer value
				{
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int  add=num1+num2;
		System.out.println("Addition of num1 & num2 is: " + add);
			}
			temp++;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		scan.close();
		
		

	}

}
