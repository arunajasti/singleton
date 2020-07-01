package stringMethods;
// It replaces all the oldChar characters with newChar characters.
// String replace(char oldChar, char newChar): 
public class Replace {

	public static void main(String[] args) {
		String s1="Rama Jasti";
		System.out.println(s1.replace('a', 'm'));//replace 'a' with  'm'
		
	String replacevalue=s1.replace("Jasti", "Bolla");//replace word "Jasti" with "Bolla"
	System.out.println(replacevalue);
		

	}

}
