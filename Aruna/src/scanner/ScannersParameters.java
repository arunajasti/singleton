package scanner;

import java.util.Scanner;

//If many methods read input, declare a Scanner in Main and pass it to the others as a parameter.

public class ScannersParameters {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int sum=readsum(scan);//calling the method 
		System.out.println("the sum is: "+sum);
		scan.close();
		
	}

	private static int readsum(Scanner scan) 
	{
        int n1,n2,n3;//in method there is no creating scanner in method the argumnet is scannerr
        System.out.println("Enter the integer values");
        n1=scan.nextInt();
        n2=scan.nextInt();
        n3=scan.nextInt();

        int add=n1+n2+n3;
        
		return add;
	}

}
