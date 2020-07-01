package stringMethods;
//The java string contains() method searches the Sequence of Characters in this string. 
//It returns true if sequence of char values are found in this string otherwise returns false.
public class Contains {

	public static void main(String[] args) {
	String name="Learn java very quickly as soon as possible";
	
	System.out.println(name.contains("learn java"));
	System.out.println(name.contains("as soon as"));
	System.out.println(name.contains("hello"));

	}

}
