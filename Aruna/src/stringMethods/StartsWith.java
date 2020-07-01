package stringMethods;
/*It is used for checking PREFIX of a String. It returns a boolean value true or false
 it returns true if the String startswith  given prefix else returns false
 *The syntax or signature of startWith() method is given below.
 * public boolean startsWith(String prefix)  :it returns true if given String prefix or not
public boolean startsWith(String prefix, int offset)  or boolean startsWith(String str, index fromIndex): 
  */
public class StartsWith {

	public static void main(String[] args)
	{
		String s1="Rama is a good father";
		
		boolean first=s1.startsWith("Rama");//first method prefix is "Rama" its true because the string starts with Rama
		System.out.println(first);
		
		boolean first1=s1.startsWith("good");//it false because good is in middle not start
		System.out.println(first1);
		
		boolean second=s1.startsWith("is",5); //its true because "is" index is start with 5
		System.out.println(second);
		
		boolean second2=s1.startsWith("father", 14); //its false because "father" index is 15
		System.out.println(second2);

	}

}
