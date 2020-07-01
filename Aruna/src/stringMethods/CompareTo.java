package stringMethods;
//generally CompareTo is to compare the String alphabetical order. it tells lessthan(-),equal(0),GreaterThan(+)

public class CompareTo {

	public static void main(String[] args)
	{
		String s1="Rama";
		String s2="aruna";
		String s3="Rikhil";
		String s4="Arjun";
		String s5="arjun";
		
		//THIS IS ANOTHER WAY to Compare the Strings
		int value=s4.compareTo("Arjun");//why we declare INT  here because compareTo output comes -1,0,+1
		System.out.println(value); //0 because s4 is "Arjun" CompareTo "Arjun" both are same
		
		int value1=s1.compareTo(s2);  //we can write the code like this OR
		System.out.println(value1); //s1<s2  -number
		
		System.out.println(s2.compareTo(s3));//s2<s3 +number  //LIKE THIS
		System.out.println(s3.compareTo(s4));//s3>s4 +number
		System.out.println(s2.compareTo(s4));//s2>s4 +number
		System.out.println(s4.compareTo(s5));//s4!=s5 because compareTo is case-sensitives

	}

}
