package stringMethods;
//Here using 2nd Variant
//String[] String(regex,int limit);
public class Split2 {

	public static void main(String[] args) {
		String s1="java is a very easy programmabe language";
		String s2="05/19/1985";
		
		System.out.println("Split the string by white spaces with limit 0");
		String[] first=s1.split("\\s", 0);//limit 0 means it print the string line by line  by white space
		for(String word:first)
		{
			System.out.println(word);//using foreach loop to print the elments of string array
		}
		System.out.println("Split the string by white spaces with limit 1");
		String[] first1=s1.split("\\s", 1);//limit 1 means it print the string in a line  by white space
		for(String word:first1)
		{
			System.out.println(word);//using foreach loop to print the elments of string array
		}
		
		
		
		System.out.println("Split the string by / with limit 2");
		String[] second=s2.split("/", 2);//limit 2 means it print 2 lines by separted slash
		for(String word:second)
		{
			System.out.println(word);//using foreach loop to print the elments of string array
		}
		
		

	}

}
