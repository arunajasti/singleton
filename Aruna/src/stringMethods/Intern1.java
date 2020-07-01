package stringMethods;
//same as equals()
//to deal with String duplication problem in java
//It returns the canonical representation of string.
public class Intern1 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="hello";
		String s3=s1.intern();//now s1 is String literal because we use intern()
		String s4=new String("hello").intern();
		String s5=s1;//true

		System.out.println("Are s1 & s2 same: " + (s1==s2));//refernce is not same
		System.out.println("Are s1 & s2 same: " + (s1.intern()==s2));//nowit is true because s1 is now string literal because we add intern()
		
		System.out.println("Are s2 & s3 are same: " + (s2==s3));//same
		System.out.println("Are s1 & s3 are same: " +( s1==s3));//not same s1 is heap memory s3 is String pool refernce is not same
		System.out.println("Are s3 & s4 are same: " + (s3==s4));//same s3 is String literal s4 is also String literal 
	                                               	//beacuse s4 is create the string by using new and we add intern() then is comes String literal
		System.out.println("Are s1 & s5 are same: " + (s1==s5));
	}

}
