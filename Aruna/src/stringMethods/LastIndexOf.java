package stringMethods;
//lastIndexOf() is used for to finding the index of last occurrence of CHARACTER or a SUBSTRING of particular String
//same as indexof() but there find first occurence here last occurence
public class LastIndexOf {

	public static void main(String[] args) {
	String s1="this is my own my program to write";

	System.out.println(s1.lastIndexOf('t'));//'t' character last occurence is 32
	
	System.out.println(s1.lastIndexOf('r', 32));
	
	System.out.println(s1.lastIndexOf("my"));
	
	System.out.println(s1.lastIndexOf("is", 15));
	}

}
