package day.eight;
//this customerdemo main class using object refernce of customer class to pass the arguments  to constructor

public class CustomerDemo {

	public static void main(String[] args)
	{
		//In order to access the members of a class
		//we need to create an object of the class
		//syntax:- ClassName objectName=new ClassName();
		Customer customer1=new Customer("SACHIN","TENDULKAR","102","WEST","MUMBAI");
		Customer customer2=new Customer("KAPIL","DEV","200","CHANDNI CHOWK","DELHI");
		System.out.println(customer1);
		customer1.getAddress().setDoorNo("104");//change the doorno using set and the doorno is address (has a relation) class
		customer1.getAddress().setStreet("EAST");
		System.out.println(customer2);
		customer1.setLastName("RAMESH TENDULKAR");
		customer2.getAddress().setDoorNo("204");
		
		System.out.println("The values after change..");
		System.out.println(customer1);
		System.out.println(customer2);
		
		//accessing individual values of customers
		System.out.println("Customer 1 adreess is: "+customer1.getFirstName()+" "+customer1.getAddress());
	}
}
