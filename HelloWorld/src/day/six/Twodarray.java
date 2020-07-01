package day.six;
import java.util.Scanner;

public class Twodarray 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[2][3];	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
		System.out.println("given the values");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)

				System.out.print(a[i][j]+"\t");
			System.out.println();

sc.close();

		}
	}

}



