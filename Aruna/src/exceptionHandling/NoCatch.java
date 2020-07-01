package exceptionHandling;
//Here no catch block(Exception is not handled here but still finally block is executed)
//but finally block is Executed
public class NoCatch {

	public static void main(String[] args) 
	{
		try{
		int data=25/0;
		System.out.println("The value of data is: " + data);
		}
		finally
		{
			System.out.println("Finall block is executed");
		}
	}

}
