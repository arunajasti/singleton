package scanner;

import java.util.Scanner;

public class TwoDimensionalScanner {

	public static void main(String[] args) 
	{
		int[][] a=new int[2][3];

		Scanner scan=new Scanner(System.in);
         System.out.println("enter the values");//  this two for loops for enter the values in an array
		      
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=scan.nextInt();       // 

		System.out.println("Given values");
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			
				System.out.print("\t "+ a[i][j]);	
				System.out.println();
				scan.close();
            }
		
		


	}

}
