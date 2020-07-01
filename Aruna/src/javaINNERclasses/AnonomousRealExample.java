package javaINNERclasses;
class eat
{
	{//Aclass doesn't hava any name is called Anonomous java inner class
		System.out.println("This is Anonomous class");
	}
	static
	{
		System.out.println("Static Block");
	}
	eat()//default construcotr
	{
		System.out.println("This is default conatructor fo EAT class");
	}
	eat(String name )//one argument constructor
	{
		String n=name;
		System.out.println("This is Argument constuctor of Eat : " + n);
	}
	public void display()//this is method
	{
		System.out.println("Display Method inEat class");
		
		
	}
}
public class AnonomousRealExample {

	public static void main(String[] args)
	{
		eat e1=new eat();
		e1.display();

		eat e2=new eat("mango");
		e2.display();
		
	}

}
