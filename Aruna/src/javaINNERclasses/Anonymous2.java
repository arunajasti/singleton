package javaINNERclasses;
abstract class Message1
{
	public void dispaly()
	{
		System.out.println("This is Abstarct class Display method");
	}
	abstract void greet();
}
public class Anonymous2 {
	 Message1 mes=new Message1()//At end of this line we can't put SEMICOLON(;) because it is abstract class we can't create object
			{	
				void greet() 
				{
					System.out.println("Good morning");
				}
			};	
			public void print()
			{
				System.out.println("Print the method");
			}
	
public static void main(String[] args) 
		{
	
			Anonymous2 any=new Anonymous2();
			any.mes.greet();//Anonymousclass.abstarct messgae.abstarctMethod
		any.print();
		any.mes.dispaly();
		}
			
			}
