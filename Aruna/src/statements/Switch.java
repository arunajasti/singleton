package statements;
//A switch statement allows a variable to be tested for equality against a list of values. 
//Each value is called a case, and the variable being switched on is checked for each case.
//The variable used in a switch statement  be integers, convertable integers (byte, short, char), strings and enums.
import java.util.Scanner;

//Write a program that accepts user input from the console. (TAKING THE INPUTS BY USER MEANS using Scanner)
//The program should take a number and then test for the following age ranges: 0 to 10, 11 to 20, 21 to 30, 30 and over.
//Display a message in the Output window in the following format:

//user_age + " is between 21 and 30"

public class Switch {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user Age");
		       int age=scan.nextInt();
		       
		       switch(age){//switch stmt allows a variable name(age).age is int 
		       
		    	   case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
		    		   System.out.println("user age betweeen 0 to 10: "+age);
		    		                     break;
		    		                     
		    	   case 11:case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
		    		   System.out.println("user age betweeen 11 to 20: "+age);
		    		                      break;
		    	  case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:
		    		   System.out.println("user age betweeen 21 to 30: "+age);
		    		                       break;
		    		                       
		    		                       
		     default:
		    	           System.out.println("user age is over 30");
		    	   
		       }
		
		
		scan.close();
	}

}
