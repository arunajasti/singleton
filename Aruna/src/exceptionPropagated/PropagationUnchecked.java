package exceptionPropagated;

public class PropagationUnchecked {

	public void method1()
	{
		int data=10/0;                                                 //Unchecked Exceptions
		System.out.println("data is : " + data);
	}
	public void method2()
	{
		method1();	
	}
	public void method3()
	{

		try{
			method2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void main(String[] args) {

		PropagationUnchecked pun=new PropagationUnchecked();
		pun.method3();
		System.out.println("Exception handled");
	}

}
