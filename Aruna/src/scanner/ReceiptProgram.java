package scanner;

import java.util.Scanner;

public class ReceiptProgram {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("how many people ate :");
		int people=scan.nextInt();
		double subtotal=0;
		for(int i=1;i<=people;i++)
		{
			System.out.println("Person # " +i+":" +"How much did you cost dinner?");
			double dinnercost=scan.nextDouble();
			subtotal=subtotal+dinnercost;
		}
		//System.out.println("Total Dinnercost is: "+subtotal);
		
		results(subtotal);
		scan.close();
		}
	 public static void results(double totalcost)//totalcost =subtotal
	 {
		 double tax=totalcost*0.08;
		 double tip=totalcost*0.15;
		 double total=totalcost+tax+tip;
		 
		 System.out.println("Subtotal: " +"$" +totalcost);
		 System.out.println("Tax: " +"$"+tax);
		 System.out.println("Tip: " +"$"+tip);
		 System.out.println("Total: " +"$"+total);
		 
		 
	 }
	
}
