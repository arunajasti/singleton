package stringMethods;
import java.util.Arrays;
//method converts this string into character array. 
//The returned array length is equal to the length of the String and the sequence of chars in Array matches the sequence of characters in the String.
//length of string==length of sequence of chars
public class TocharArray {
	public static void main(String[] args) {

		String s1="Aruna";
		char[] name=s1.toCharArray();//converting String into Char array
		System.out.println("String is : " + s1 );
		System.out.println(" Char Array :"+ Arrays.toString(name)); //here using tostring() to print all chars
		// I am using Arrays.toString(char[]) in order to print the character array in a more readable way.

	/*	System.out.println("String is : " + s1);
		System.out.println("Char array");
		for(int  i=0;i<name.length;i++)
		{
			System.out.println( name[i]);
		}*/
}

}