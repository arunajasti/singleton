package scanner;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) 
	{
	int[] a=new int[10];
	int temp;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the values");
	for(int i=0;i<10;i++)
	{
		a[i]=scan.nextInt();
	}
	temp=a[0];
	for(int i=0;i<10;i++)
	{
		for(int j=i+1;j<10;j++)
		
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		
		}
	System.out.println("Ascending order ");//after loop end this for loop for ascending
	for(int i=0;i<10;i++)
		System.out.println(a[i]);//print the array a[i] values in ascending order
	
	scan.close();
	

	}

}
