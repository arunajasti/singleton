package typecasting;
//When you are converting data from big sized data type to small sized data type
public class ExplicitCasting {

	public static void main(String[] args)
	{
		int i=200;
		//byte b=i;//cannot convert from big sized data into small
           byte b=(byte)i;//explicit casting
           System.out.println("the value of i "+ i);
           System.out.println("the value of b "+ b);
	        
	}
	

}
