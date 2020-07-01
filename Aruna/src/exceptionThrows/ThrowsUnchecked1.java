package exceptionThrows;

public class ThrowsUnchecked1 {
	public void add1()throws ArithmeticException
	{
	int a;
	a=10/0;
	throw new ArithmeticException("divide by zero "+ a);
	}

	public static void main(String[] args)
	{
		ThrowsUnchecked1 ntc=new ThrowsUnchecked1();
		try{
		ntc.add1();
		}catch (Exception e)
		{
			System.out.println(e);
		}
System.out.println("Exception handled");
	}

}
