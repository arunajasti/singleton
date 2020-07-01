package scanner;

import java.util.Scanner;

public class ScannerwithoutArray {

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);

		System.out.println("enter the value");
		int a=scan.nextInt();
		//for(int i=1;i<=a;i++)
		{
		
			System.out.println("Given value " +a);
		}
		

		scan.close();

	}

}
