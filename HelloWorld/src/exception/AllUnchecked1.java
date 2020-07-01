package exception;
//when using commandline arguments throw Numberformat exception 
public class AllUnchecked1 {

	public static void main(String[] args) 
	{
		
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
		 System.out.println("The value of c is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Program run successfully");
	}

}
