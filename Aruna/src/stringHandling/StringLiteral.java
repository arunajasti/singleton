package stringHandling;
//dotnetpearls.com check
//String literal is a sequence of characters written in double quotes
//"Hello World";
//Creating String 2 ways
//1.String literal:Stored the String value in String pool
//2.New Keyword: Stored object in Heap memory
public class StringLiteral {

	public static void main(String[] args) {
		String str1="Hello World";//create two reference variables with same value "Hello world", they'd both point to the same memory location(String pool).
		String str2="Hello World";
		//str1 & str2 pointing same location(String pool)
		System.out.println(str1==str2);//print true/false
		System.out.println(str1.equals(str2));//comparing content
			
		//== is a reference comparsion i.e., pointing same location or pointing the address of object
       // equals() comparing the values		

	}

}
