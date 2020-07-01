package stringMethods;

public class Split1 {

	public static void main(String[] args)
	{
		String s1="java is a very easy programamble language";
		/*String[] word=s1.split("\\s");//or we can write another way
		System.out.println("split the STRING by white spaces");
		for(String white:word)
		{
			System.out.println(white);
		}*/
		System.out.println("length of array: " + s1.length());//length of array
		System.out.println("split the STRING by white spaces");
		for(String white:s1.split("\\s"))
			{
				System.out.println(white);
			}	
		
		
		
	}
}


