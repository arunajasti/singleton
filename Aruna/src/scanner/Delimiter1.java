package scanner;

import java.util.Scanner;

//how to Split a String Using scannner Class in Java?
// the answer is using delimiter();

//we are using Scanner to split String into multiple tokens.

//Method Returns :
//This method simply returns this Scanner object.

public class Delimiter1 {

	public static void main(String[] args)
	{
String s="JavaCourseiscompletebynextmonthoct, 31";

Scanner scan=new Scanner(s);//create a new scanner with the specified String Object

String coursename=scan.next();
System.out.println("course is :"+coursename);
int date=scan.nextInt();
System.out.println("date is: "+date);

System.out.println(scan.delimiter());

/*while(scan.hasNext())
{
	
	System.out.println(scan.next());//reads the token word by word
	}*/

scan.close();


	}

}
