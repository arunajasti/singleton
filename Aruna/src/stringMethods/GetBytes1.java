package stringMethods;

import java.io.UnsupportedEncodingException;

public class GetBytes1 {

	public static void main(String[] args) 
	{
String s1="ABCDEF";
System.out.println("byte[] getBytes()  ");
byte[] array1=s1.getBytes();//byte[] getBytes()  
for(byte b:array1)
{
	System.out.println(b);
}

System.out.println("\nbyte[] getBytes(Charset charset)  ");
try {
	byte[] array=s1.getBytes("UTF-16");//byte[] getBytes(Charset charset)  
	System.out.println("\nUTF-Encoding set");
	for(byte b:array)
	{
		System.out.println(b);
	}
	} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
