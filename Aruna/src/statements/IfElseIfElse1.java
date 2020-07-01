package statements;

import java.util.Scanner;

//For this exercise, write a program that asks a user to choose between four colours: black, white, red, or blue. 
//Use IF … ELSE IF statements to display one of the following messages, depending on which colour was chosen:

/*BLACK "You must be a Goth!"
WHITE "You are a very pure person"
RED "You are fun and outgoing"
BLUE "You're not a Chelsea fan, are you?"*/
//in OUTPUT white is not same as White because the 1st white starts with lowercase & 2nd White starts with Uppercase


public class IfElseIfElse1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter colors:Black,White,Red,Blue");
		String color  =scan.nextLine();
		if(color.equals("Black"))//If you want to check if one String is the same as another, you can use a Method called equals. 
		{
			System.out.println(color + " you must be a Goth");
		}else if(color.equals("White"))
		{
			System.out.println(color +  ": You are a very pure person");
		}else if(color.equals("Red"))
		{
			System.out.println(color + " You are fun and outgoing");
		}else if(color.equals("Blue"))
		{
			System.out.println(color + "You're not a Chelsea fan, are you?");
		}
		else
			System.out.println("Sorry,didn't catch that");
		scan.close();
		}
         
	}
