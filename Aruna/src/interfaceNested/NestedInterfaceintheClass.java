package interfaceNested;
//nested interface which is declared within the class
interface X
{
	void show();
}
class Nested  
{
	interface Y  //nested interface declare with in the class
	{
		void display();
	}

}
public class NestedInterfaceintheClass implements X,Nested.Y  //nested interface must be refferred by using outer class/Outer interface
{
	@Override
	public void show()//INTERFACE METHOD
	{
		System.out.println("outer  interface");
	}
	@Override
	public void display()//NESTED INTERFACE METHOD
	{
		System.out.println("Nested interface declare Within the CLASS");
	}
	public static void main(String[] args) {
		NestedInterfaceintheClass nes=new NestedInterfaceintheClass();
		nes.show();
		nes.display();

		//Nested.Y nes=new NestedInterfaceintheClass();
		//nes.display();

	}




}
