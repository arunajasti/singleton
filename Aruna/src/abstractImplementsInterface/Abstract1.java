package abstractImplementsInterface;
interface one
{
	void print();
}
interface two extends one
{
	void add();
}
class A implements two
{
	@Override
	public void print() {
		System.out.println("I'm print() in class A");
	}
	@Override
	public void add() {
		System.out.println("I'm add() in class A");
	}

}
class B extends A 
{
	public void display()
	{
		System.out.println("I'm display method inclass B");
	}
}
abstract class  Abstracts implements one//abstracts implemets interface
{
	abstract public void area();
	public void show()
	{
		System.out.println("thi is Abstract method");
	}
}
public class Abstract1 extends Abstracts {

	public void print() 
	{
		System.out.println("I'm a print() in class Abstract1");
	}
public void area() 
{
		System.out.println("I'm a area() in class Abstract1");
		
	}
			
	
	public static void main(String[] args) 
	{

two on=new B();
//on.display(); there is no display() in one
on.print();
on.add();
Abstract1 a=new Abstract1();
a.print();
a.area();

	}

	

}
