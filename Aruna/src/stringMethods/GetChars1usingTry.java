package stringMethods;

public class GetChars1usingTry {

	public static void main(String[] args) {
		String s1="Learn java quickly";
		char[] array=new char[6];
		//String copy=s1.getChars(2, 5, array, 0); getChars() doen't return value so this line is wrong
		try{
		s1.getChars(2, 5, array, 0);//here we get indexoutofbounds exception
		System.out.println("Arrya of content");
		for(char copy:array)
		System.out.println(copy);
	}catch(Exception e)
		{
		System.out.println(e);
		}
		}

}
