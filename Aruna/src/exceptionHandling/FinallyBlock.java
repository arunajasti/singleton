package exceptionHandling;
//Finally block is used to execute important code such as closing connection,stream etc.
//finally block is always executed whether Exception is handled or not
//Finally block must follow try or catch block
//there is only one finally block
public class FinallyBlock 
{

	public static void main(String args[])
	{
		try{
			int data=15/0;
			System.out.println(data);
		}//catch block is not using tht means exception is not handled but finally block is executed
		finally{
			System.out.println("Finally Executed");
		}

	}
}
