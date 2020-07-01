package javaINNERclasses;
abstract class Message2
{
	public void dispaly()
	{
		System.out.println("This is Abstarct class Display method");
	}
	abstract void greet();
}

public class Anonomous1
{
	 Message2 mes=new Message2()//At end of this line we can't put SEMICOLON(;) because it is abstract class we can't create object
				{	
					void greet() 
					{
						System.out.println("Good Afternoon");
					}
				};	
				public void print()
				{
					System.out.println("Print the method");
				}

}
