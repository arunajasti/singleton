package encapsulationGetandSet;

import java.util.Scanner;

public class Nameinfo
{
	//static String  personname;//if i declare personname in here and use thisvariable in main() i must eclare as static because main is static

	public static void main(String[] args)
	{
		String personname;
	    //create an object of Name class
		Name n=new Name();
		
		// create a Scanner object to obtain input from the command window
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Intial Username is: " + n.getUsername());
		System.out.println("Enter username");
		personname  =scan.next();
         n.setUsername(personname);//put a name into object n.
         
		/*n.setUsername("aruna");*/
		System.out.println("Username is: " + n.getUsername());
		scan.close();
	}

}
