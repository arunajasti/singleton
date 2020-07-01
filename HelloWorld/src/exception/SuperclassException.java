package exception;
//Exception is superclass of all Exceptions(arithmatic,numberformat,...........)
public class SuperclassException {

	public static void main(String[] args)
	{
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
		 System.out.println("The value of c is "+c);
		}
		catch(Exception e)//Exception is superclass of all exceptions
		{
			System.out.println(e);
		}
		System.out.println("Program runs successfully");
	}

}
