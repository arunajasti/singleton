package stringHandling;
//Creating String by using New Keyword
public class StringNEW {

	public static void main(String[] args) 
	{
String str1=new String("Hello World");//this is hello world object of  str1 in one location
String str2=new String("Hello World");//this is hello world object  of str2 in another location
String str3=str1;//these two reference variable pointing same object 

System.out.println(str1==str2);//false
System.out.println(str1==str3);//true
System.out.println(str1.equals(str2));//true

	}

}
//why the first stmt false means STR1 is one object & STR2 is another object both objects in differnt location
//check YOUTUBE DURGASOFT than it understand difference between == operator & equals()