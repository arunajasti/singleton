package stringMethods;
//compare two strings content 
//comparing the String with case- sensitive
public class Equals {

	public static void main(String[] args) {
		String s1="Aruna";
		String s2="aruna";
		String s3="Aruna";
		
		System.out.println(s1.equals(s2));//false because s1 starts with capital "A" & s2 starts with small letter "a"
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s2));//false
	
		System.out.println(s2.equals("aruna"));//true
	}

}
