package day.six;

import java.util.Scanner;

public class Twodarrayaddition1 {

	public static void main(String[] args) 
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first matrix..");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();

		System.out.println("Enter second matrix..");
		for(int i=0;i<b.length;i++)
			for(int j=0;j<b[i].length;j++)
				b[i][j]=sc.nextInt();

		int c[][]=new int[2][2];
		for(int i=0;i<c.length;i++)
			for(int j=0;j<c[i].length;j++)
				c[i][j]=a[i][j]+b[i][j];

		System.out.println("sum of matrix is...");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
		        
			}
		System.out.println();

		}

	}

}
