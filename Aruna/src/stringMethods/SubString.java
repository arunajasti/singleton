package stringMethods;
/*substring() method returns a part of the string. substring() method has two forms,
public String substring(int beginindex);              startIndex : starting index is inclusive

public String substring(int beginindex, int endindex);  endIndex : ending index is exclusive*/
 //it returns string
public class SubString {

	public static void main(String[] args) 
	{
	String str="Study to night";
	//it print from starting index(7) to till the end of the String
	System.out.println(str.substring(7));//public String substring(int begin);                      7 char is(o) inclusive for staring index 
	
	//it starts 4 index and ends with before 7 index
	System.out.println(str.substring(0,7));//public String substring(int begin, int end)   (0,7) 0 is starting index so S char is inclusive 
	                                                                                                                                        // 7 is ending index  so o char is exclusive
	}

}
