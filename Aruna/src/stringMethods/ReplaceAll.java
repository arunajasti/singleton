package stringMethods;
/* String replaceAll(String regex, String replacement): 
 It replaces all the substrings that fits (matches) the given regular expression with the replacement String.
 regex=regular expression
 replacement=replacement sequence of characters
 
 */
public class ReplaceAll {

	public static void main(String[] args) 
	{
		String str1="I am a good Mother";
		
		String replaceall=str1.replaceAll("good","very nice");//replace with word
		System.out.println(replaceall);
		
		System.out.println(str1.replaceAll("o","a"));//replace with char but here use double("","") quotes but replace() use single quotes
		
		System.out.println(str1.replaceAll("\\s", ""));//remove white spaces
	}

}
