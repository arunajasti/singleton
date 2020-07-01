package stringHandling;

public class StringLiteralandNew {

	public static void main(String[] args)
	{
		
String str1="java";
String str2=new String(str1);

System.out.println(str1==str2);//false because str1 value stored in string pool
                                                 //                      str2 valaue stored in Heap memory both are in different location
System.out.println(str1.equals(str2));//true because both have same values
	}

}
