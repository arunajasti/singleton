package day.six;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args)
	{
		int a[]=new int[10];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values..");
		for(int i=0;i<a.length-1;i++)
			a[i]=sc.nextInt();
		boolean fixed=false;
		while(fixed==false)
		{
			fixed=true;

			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
					fixed=false;

				}
			}
		}
		System.out.println("Numbers in ascending order");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		sc.close();
	}

}
