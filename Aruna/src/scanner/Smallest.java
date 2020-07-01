package scanner;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner scan=new Scanner(System.in);

		System.out.println("enter the values");
		for(int i=0;i<5;i++)
			a[i]=scan.nextInt();

		System.out.println("Find smallest number");
		int temp=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]<temp)
			{
				temp=a[i];
			}

		}

		System.out.println("smallest number is: "+ temp);//smallest variable store in temp


		scan.close();


	}

}
