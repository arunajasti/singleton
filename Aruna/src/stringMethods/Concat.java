package stringMethods;

public class Concat {

	public static void main(String[] args)
	{
		//String s1= new String("Hi"); or
		String s1="Hi";
		String s2="Rama";
		
		String s3=s1. concat(s2);
		System.out.println(s3);
		
		String s4="Hi".concat("Aruna"); //works with String literals too
        System.out.println(s4);
	}

}
