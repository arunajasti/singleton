package stringMethods;
//charAt() function returns the character located at the specified index. 
public class CharAt {

	public static void main(String[] args)
	{
		String s1="StudyToNight";
		System.out.println(s1.charAt(2));//one way
		
		char value=s1.charAt(3);//This is an another way
		System.out.println("find the String letter at index 3: " + value);//
		
		//These code shows  the O/P  differently
	/*int value1=s1.charAt(3);// it returns  value of int but CharAt returns Char not INT
		System.out.println("find the String letetrh at index 3: " + value1);*/
		
		

	}

}
