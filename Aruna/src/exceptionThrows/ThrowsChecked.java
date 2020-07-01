package exceptionThrows;

import java.io.IOException;

class ThrowsExample 
{
	public void method(int num1,int num2) throws IOException,ClassNotFoundException//throws clause  is used in method signatiure
	{
		int val=2;
		if(val==num1/num2)
	        throw new IOException("Exception Message1");
			//System.out.println("the num1 value is 1");
	     else
          throw new ClassNotFoundException("Exception message2");
	}
	}
public class ThrowsChecked {

	public static void main(String[] args) {
		ThrowsExample th=new ThrowsExample();
		try{
			th.method(2,1 );
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
