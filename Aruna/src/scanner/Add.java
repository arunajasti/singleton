package scanner;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner(System.in);
		           System.out.println("enter the first value");
                  int sum1  =scan.nextInt();		//the first value store in sum1
                  System.out.println("enter the second value");
                  int sum2  =scan.nextInt();		//the second value store in sum2
                  System.out.println("the sum is");
                  int sum3=sum1+sum2;
                  System.out.println(sum3);
                  
                  scan.close();
	}

}
