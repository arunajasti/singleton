package encapsulationGetandSet;

import java.util.Scanner;

public class Studentinfo2 {

	public static void main(String[] args)
	{
		int rollno;
		String firstname;
		String lastname;
		String address;

		Student2 stu=new Student2();
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter RollNo");
		rollno  =scan.nextInt();
		stu.setRollno(rollno);

		System.out.println("Enter Firstname");
		firstname  =scan.next();
		stu.setFirstname(firstname);      
		
		System.out.println("Enter Lastname");
		lastname  =scan.next();
		stu.setLastname(lastname);
		
		System.out.println("Enter Address");
		address  =scan.next();
		stu.setAddress(address);
		
		System.out.println("RollNo: "+ stu.getRollno() );
		System.out.println("FirstName: "+ stu.getFirstname());
		System.out.println("LastName: " + stu.getLastname());
		System.out.println("Address: " + stu.getAddress());
		scan.close();

	}

}
