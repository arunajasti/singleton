package exceptionPropagated;

import java.io.IOException;

public class PropgationCheckedThrows {
	
	public void method1() throws IOException
	{
		throw new IOException("device error");//checked Exception propagated by using throws keyword used in method declaration
	}
	public void method2() throws IOException
	{
		method1();
	}
public void method3()
{
	try{
		method2();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		
PropgationCheckedThrows pct=new PropgationCheckedThrows();
pct.method3();
System.out.println("Exception handled");
	}

}
