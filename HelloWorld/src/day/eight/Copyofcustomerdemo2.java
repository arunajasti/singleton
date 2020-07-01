package day.eight;


import java.util.Scanner;
public class Copyofcustomerdemo2 
{

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
		String firstName=null;
		String lastName=null;
		String doorNo=null ,street=null,city=null;//address
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
					System.exit(0);
				}


			}

			System.out.println("Customer not found..");
			break;

			case 3:  System.out.println("Display all customers");

			//for(int i=0;i<=customers.length;i++)here( customers.length) means we have to give the customers 
			//details 20times.for ex if we give 2 customer details the remaining 18 are null so that's why using(index)
			for(int i=0;i<=index;i++)
			{

				System.out.println(customers[i]);//customers[i] to print all values in Array
			}                
			break;

			case 4: System.out.println("Update customer Address");
			Address address=new Address( doorNo, street, city);

			System.out.println("Enter the doorNo");
			doorNo = scanner.next();

			System.out.println("update the doorno");
			doorNo = scanner.next();
			//Customer.setAddress(scanner.nextLine());


			for(int i=0;i<=index;i++)
			{
				if(address.getDoorNo()==doorNo)
				{
					address.setDoorNo(doorNo);
					doorNo=scanner.next();
					System.out.println("udate the address field" +customers[++index]);
					break;
				}
			}
			scanner.close();

			}	
		}
	}


}



