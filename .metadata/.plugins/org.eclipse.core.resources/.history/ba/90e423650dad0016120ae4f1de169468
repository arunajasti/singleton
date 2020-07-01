package exceptionPropagated;

//import java.io.IOException;

public class PropagationChecked {


		public void method1() 
		{
			//throw  new IOException("Device Error");  //checked exceptions cannot be propagated compiler error will come here
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
		public static void main(String[] args)
		{
			PropagationChecked pc=new PropagationChecked();
			pc.method3();
			System.out.println("Exception Handled");

}
}
