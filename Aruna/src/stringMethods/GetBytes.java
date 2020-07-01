package stringMethods;
//string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.
/*Signature
There are 3 variant of getBytes() method.
public byte[] getBytes()  
public byte[] getBytes(Charset charset)  
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException  
*/
public class GetBytes {

	public static void main(String[] args) 
	{
	String s1="ABCDEF";
	
	byte[] array=s1.getBytes();//public byte[] getBytes()  
	//System.out.println(array);
	for(int i=0;i<array.length;i++)//for(byte b:array)
	{
		System.out.println(array[i]);//System.out.println(b);
	
	}

	}

}
