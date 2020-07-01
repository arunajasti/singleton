package stringMethods;

public class IndexOf1 {

	public static void main(String[] args)
	{
		
String s1="This is my own my programme";

System.out.println("int Indexof(int ch): " + s1.indexOf('i')); //the first chracter 'i' index is 2//find out character/string in first occurrence

System.out.println("find the 'm' char from index 9");//15 the first m index is 8 and second index is 15
System.out.println("int Indexof(int ch,int fromIndex): " + s1.indexOf('m', 9));

System.out.println("find the index of substring is");
System.out.println("int Indexof(String substring): " + s1.indexOf("is"));//'this' word there is a 'is'so index is 2

System.out.println("find the sunstring of 'my' from index 8");//8
System.out.println("int Indexof(String substr,int fromIndex): " + s1.indexOf("my", 8));

System.out.println(s1.indexOf('b'));//-1 because there is no b in given string so it return -1


	}

}
