package day.six;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args)
	{
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values...");
	for(int i=0;i<10;i++)
	a[i]=sc.nextInt();
	
	System.out.println("given the values...");
		for(int i=0;i<10;i++) //this for loop for print all the values of a
			System.out.println(a[i]);

		sc.close();
		
	}

}
