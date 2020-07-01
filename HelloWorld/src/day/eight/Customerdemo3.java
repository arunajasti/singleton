package day.eight;

import java.util.Scanner;

public class Customerdemo3 {
	public static void main (String[] args)
	{
		Customer customers[]=new Customer[20];
		Scanner scanner=new Scanner(System.in);
		int choice;
		int custId;
		String firstName;
		String lastName;
		String doorNo,street,city;//address
		int index=-1;


		//Scanner input = new Scanner(System.in);
		//double[] numbers = new double[5];
		System.out.println("enter id");
		custId=scanner.nextInt();

		for (int i = 0; i < customers.length; i++)
		//for(Customer i:customers)
		{
			
			if(customers[i].getCustomerId()== custId)
			{


				System.out.println("customer FirstName:"+customers[i].getFirstName());
				System.out.println("customer LastName:"+customers[i].getLastName());
				System.out.println("customer doorNo:"+customers[i].getAddress());

				System.exit(0);
			}
		scanner.close();
		}
	}
}
