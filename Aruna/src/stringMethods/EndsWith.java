package stringMethods;
/*It is used for checking SUFFIX of a string
 *  It returns true if this string ends with given suffix else returns false.

public boolean endsWith(String suffix)  */

public class EndsWith {

	public static void main(String[] args) 
	{
		String s1="Aruna is a good mother";
		
		boolean first=s1.endsWith("mother");
		System.out.println(first);
		
		boolean second=s1.endsWith("good");
		System.out.println(second);

	}

}
