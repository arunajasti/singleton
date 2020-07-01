package methods;

public class Method111 {

	public static void main(String[] args)
	{

addsub as=new addsub();//create the object of class addsub
as.print();//method call

	}
}
	class addsub
	{
		int a=2;
		int b=3;
		public void add()
		{
           int sum=a+b;
           System.out.println("addition a+b is:" +sum);
		}
		public void sub()
		{
          int sub=a-b;
          System.out.println("subtraction is: "+sub);
          }
		public void print()
		{
			System.out.println("Hai");
			add();
			sub();
		}
	}


