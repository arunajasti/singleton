package day.eight;

public class Customer 
{
	//default modifier
	//defaut scope is with the the package
	//followings are instance variables
	//they are created for every object and destroyed along with object
	private int customerId;
	private String firstName;
	private  String lastName;
	//HAS-A RELATION SHIP
	private  Address address;
	
	//it is called static variable
	//it is created once for a program
	//its memory location is seperate from object memory location
	//because it will not be created along with object but destroyed when program ends
	
	private static int counter=100;
	
	//constructor is a special member function which is executed automatically
	//constructor name must be same as class name
	//constructor does not return any value
	
	public Customer(String firstName, String lastName,String doorNo,String street,String city) 
	{
		this.customerId = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(doorNo,street,city);
	}

	//It is automatically executed when we use the object inside syso
	
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

	
	//setters and getters are used to store and retrieve indivial property of an object
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
