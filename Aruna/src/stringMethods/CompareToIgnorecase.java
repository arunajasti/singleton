package stringMethods;
//same as compareTo() but here to ignore the case(uppercase & lowercase)
public class CompareToIgnorecase {

	public static void main(String[] args) {
		String s1="Rama";
        String s2="raMa";
        String s3="ArUna";
        String s4="aruna";
        
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s3.equalsIgnoreCase(s4));//true
        System.out.println(s1.equalsIgnoreCase(s3));//false
        
	}

}
