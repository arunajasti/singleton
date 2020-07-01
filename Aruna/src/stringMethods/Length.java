
package stringMethods;
//The java string length() method length of the string.
//It returns count of total number of characters.

public class Length {

	public static void main(String[] args) 
	{
		String s1="Rama";
		String s2=new String("Aruna");
		
		System.out.println("s1 String length: " + s1.length() );//4
		System.out.println("s2 String length: " + s2.length() );//5
		
		/*int firststring=s1.length(); why we declare int here because it returns int value
		System.out.println("s1 String length: " + firststring );*/
	}

}
