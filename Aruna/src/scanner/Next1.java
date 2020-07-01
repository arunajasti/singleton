package scanner;

import java.util.Scanner;
//public String next(): Returns the token before delimiter(white spaces)

/*Exception
NoSuchElementException -- if no more tokens are available
IllegalStateException -- if this scanner is closed
 */
public class Next1 {

	public static void main(String[] args) 
	{
String s="Hello World 3.0+3.0=6.0";

Scanner scan=new Scanner(s);//create a new scanner with the specified String Object
//find the next token & print it out
System.out.println(scan.next());//first print Hello(before space)

//find the next token & print it out
System.out.println(scan.next());//next print World(before space)

//find the next token & print it out
System.out.println(scan.next());//next print 3.0+3.0=6.0


scan.close();

	}

}
