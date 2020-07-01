package stringMethods;
//compare two strings and ignore the case
// It works same as equals method but it doesn’t consider the case while comparing strings.
//It does a case insensitive comparison.
public class EqualsIgnorecase {

	public static void main(String[] args)
	{
		String s1="rama";
		String s2="Rama";
		String s3="aruna";
		String s4="Aruna";
		String s5=new String("Aruna");

		System.out.println("Using equalsIgnoreCase()");
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s3.equalsIgnoreCase(s4));//true
		System.out.println(s4.equalsIgnoreCase(s5));//true
		System.out.println(s5.equalsIgnoreCase("Rama"));//s5 is Aruna comparing Rama so it is false content is not matched

		System.out.println("Using equals()");

		System.out.println(s1.equals(s2));//false because s1 'r' is small and s2 'R' is capital so both content is not matched
		System.out.println(s3.equals(s4));//false
		System.out.println(s4.equals(s5));//true  because both content is matched 

	}

}
