package abstractclass;
abstract class inheritance
{
	public void display()
	{
		System.out.println("Abstract class implemnted method");
	}
	abstract void print();
	}
public class AbstractInheritance extends inheritance //class of main()
{
	void print() //we can't implement the methods inside main() but implement in same class as main
	{
System.out.println("print the abstract method");

	}
	public static void main(String[] args) //main()
	{
		AbstractInheritance ab=new AbstractInheritance();
		ab.print();
		ab.display();
		
		
		
		
	}

	

}
