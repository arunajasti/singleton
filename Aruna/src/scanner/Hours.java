package scanner;
//Write a program that reads two employees' hours and displays each employee's total and the overall total hours.
//displays each employee's total and the overall total hours
//The company doesn't pay overtime; cap each day at 8 hours.

import java.util.Scanner;

public class Hours {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int hours1= processEmployee(scan, 1);
		int hours2= processEmployee(scan, 2);
		
		int total=hours1+hours2;
		System.out.println("Total hours of both employee "+total);

		scan.close();

	}

	private static int processEmployee(Scanner scan,int number) 
	{

		System.out.println("Employee "+number+  " How many days:");
		int days=scan.nextInt();
		int hours=0;
		for(int i=1;i<=days;i++)
		{
			
			System.out.println("Enter hours");
			hours=hours+scan.nextInt();
			
		}
		System.out.println("Hours: "+hours);
		
           int totalhours=hours;
           
         double hoursperday=(double)totalhours/days;
         System.out.println("Employee  :"+ number +" ,"+" TotalHours:  " +totalhours+" ,"  +" Hoursperday: "+hoursperday);
		return totalhours;
	}

}
