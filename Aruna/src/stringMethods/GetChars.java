package stringMethods;

public class GetChars {

	public static void main(String[] args)
	{
	String s1="Learn java quickly";
	char[] array=new char[6];//0nly 6 characters allow in array
	//String copy=s1.getChars(2, 5, array, 0); getChars() doen't return value so this line is wrong
	
	s1.getChars(2, 6, array, 0);
	System.out.println("Array of content1");
	for(char copy:array)
	{
		System.out.println(copy);
	}
	
	s1.getChars(2, 9, array, 0);//begin 2 index end with before 9 means 8th index total 7 characters so we will get arrayindexoutof bounds
	System.out.println("Array of content1");
	for(char copy:array)
	{
		System.out.println(copy);
	}
	
	s1.getChars(4, 2, array, 0);//here we get indexoutofbounds exception
	System.out.println("Array of content2");
	for(char copy:array)
	
		System.out.println(copy);
	
	}

}
