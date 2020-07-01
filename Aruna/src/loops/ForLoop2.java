package loops;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args)
	{
		int [] number=new int[3];

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the numbers");
		for(int i=0;i<3;i++)
		{
			number[i]  =scan.nextInt();
		}
		System.out.println("given the numbers");
		for(int k:number)
			System.out.println(k);
		scan.close();

	}
}
