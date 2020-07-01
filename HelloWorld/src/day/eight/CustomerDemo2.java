package day.eight;
//this customerdemo2 main class giving values from i/p(using scanner class) and creating array
import java.util.Scanner;

public class CustomerDemo2 {

	public static void main(String[] args) 
	{

		Customer customers[]=new Customer[20];//to create array of customers(customers[] is array name and Customer is classname of Customer)
		/* int a[]=new int a[20];here a is arrayname same as customers[] is array name
		 * for (int i=0;i<a.length;i++)a.lenth is length of array
		 * s.o.pln(a[i]); same as (customers[++index])
		 * 
		 */

		Scanner scanner=new Scanner(System.in);
		int choice=0;
		int custId;
		String firstName;
		String lastName;
		String doorNo = null ,street=null,city=null;//address
		int index=-1;//index number for the array
		while(choice<4)
		{
			System.out.println("1. ADD NEW CUSTOMER");
			System.out.println("2. DISPLAY CUSTOMER BY ID");
			System.out.println("3. DISPLAY ALL CUSTOMERS");
			System.out.println("4. UPDATE ADDRESS");;
			System.out.println("5. E X I T");
			System.out.println("Enter your choice...");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter First Name :");//
			firstName=scanner.next();
			System.out.println("Enter Last Name :");//
			lastName=scanner.next();
			System.out.println("Enter doorNo :");//
			doorNo=scanner.next();
			System.out.println("Enter street :");//
			street=scanner.next();
			System.out.println("Enter city :");//we need this values to customers array
			city=scanner.next();
			//create one object(customer) that object add the values in to array customers[++index]
			Customer customer=new Customer(firstName,lastName,doorNo,street,city);
			customers[++index]=customer;
			System.out.println("Ur Id is :"+customer.getCustomerId());					
			break;

			case 2:		System.out.println("Enter your Id: ");
			custId=scanner.nextInt();


			//for(int i=0;i<=customers.length;i++)
			for(int i=0;i<=index;i++)
			{
				if(customers[i].getCustomerId()==custId)
				{
					System.out.println(customers[i]);
					break;
				}

				else if(customers[i].getCustomerId()!=custId)
				{
					System.out.println("Customer not found..");
					break;
				}
			}
			break;

			//System.out.println("Customer not found..");
			//break;

			case 3:  System.out.println("Display all customers");


			for(int i=0;i<=index;i++)
			{

				System.out.println(customers[i]);//customers[i] to print all values in Array
			}                
			break;


			case 4: 
				System.out.println("enter the doorNo");
				doorNo=scanner.next();

				Address address=new Address(doorNo,street,city);
				System.out.println("enter the doorNo");
				doorNo=scanner.next();


				for(int i=0;i<=index;i++)
				{
					if(address.getDoorNo()==doorNo)



					{
						System.out.println("Update address field");
						address.setDoorNo(doorNo);
						doorNo=scanner.next();
						System.out.println("udate the address field" +customers[i]);
						break;
					}
				}
			case 5:System.out.println("E X I T");

			System.exit(0); 
			break;
			}

scanner.close();


		}	
	}
}




