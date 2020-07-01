package scanner;

import java.util.Scanner;

public class CumulativeScanner2 {
	public static void main(String[] args)
	{    //using scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the count");
		int count=scan.nextInt();
		int sum=0;
		for(int i=0;i<=count;i++)
		{
			sum=sum+i;
		}
		System.out.println("Cumulative Sum is: " + sum);
		scan.close();
	}

}
