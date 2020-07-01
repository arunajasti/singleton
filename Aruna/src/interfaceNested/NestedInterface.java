package interfaceNested;
//nested interface which is declared within the interface
interface A
{
	void show() ;
	
	interface B   //Nested Interface within the Interface
	{
		void display();
	}
	}
public class NestedInterface implements A.B  //Nested interface must be referred by using outer interface/outer class
{
	public void display() 
	{
		System.out.println("Hello Nested Interface");
		}
	public void show()
	{
		System.out.println("Outer Interface");
	}
	public static void main(String[] args) 
	{
		NestedInterface nes=new NestedInterface();
		//A.B nes=new NestedInterface();//A.B is nested interface so the reference variable can access only nested methods/variables//runtime polymorphism
		nes.display();
		nes.show();
		

	}

	
	

}
