package stringMethods;
/*The method split() is used for splitting a String into its substrings based on the given delimiter/regular expression. 
 
 * 
This method has two variants:
String[] split(String regex): It returns the array of strings(String []) after splitting this string based on the given regular expression.
String[] split(String regex, int limit): 
 * 
 * */
//Here using 1st variant String[] =String name.split(String regex)
public class Split {

	public static void main(String[] args)
	{
		String s1="java is a very easy programamble language";
		String[] word=s1.split("\\s");//split the string by white spaces.("\\s") is aregular expression to remove white spaces
		
		System.out.println("split the STRING by white spaces");
		for(String white:word)//using java foreach loop to print elements of string array  
		{
			System.out.println(white);
		}
	}

}
