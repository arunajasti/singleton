package scanner;

import java.util.Scanner;

public class Next2 {

	public static void main(String[] args)
	{

Scanner scan=new Scanner(System.in);
System.out.println("Enter Full Name");

String firstname=scan.next();//read the first token
String lastname=scan.next();//read the second token

System.out.println("Firstname is "+firstname);
System.out.println("lastname is "+lastname);

scan.close();

	}

}
