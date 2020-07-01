package scanner;

import java.util.Scanner;

public class Definition1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);//create scanner object & read the values from console
		
		System.out.println("Enter the Name");
		     String name=scan.next();
		     
		 System.out.println("Enter Age");    
		         int age=scan.nextInt();
		         
		         System.out.println("Enter salary");
		         double salary=scan.nextDouble();
		         
		         System.out.println("Customer details  \n " + name +" "+ age +" "+salary);
		         
		         System.out.println("Enter three integer values");
		         int i1=scan.nextInt();
		         int i2=scan.nextInt();
		         int i3=scan.nextInt();
		         int sum=i1+i2+i3;
		         System.out.println("sum is: "+ sum);
		         
		         int avg=sum/2;
		         System.out.printf("Average: %d " ,+avg);
		         
		         
		         
		scan.close();
		
	}

}
