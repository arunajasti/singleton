package interfaceTopic;
interface Program1//THIS IS INTERFACE CLASS
{
	//int a; Interface variables must be initialized at the time of declaration otherwise compiler will through an error.
	int a=10;
	public void show();//this is abstract method so we dont need to declare Abstract because it is Interface.
	                               //Interface is a mechanism to fully achieved ABSTRACTION
}
public class SimpleInterface  implements Program1 //a class implements an Interface by using Implements keyword
{
	@Override
	public void show()
	{
		System.out.println("This is interface method implementing in a class :" + a);
	}
	
	public void display()
	{
		int a=20;
		System.out.println("Class method accessing Interface Variable : " + a);
	}

public static void main(String[] args) 
	{
	
SimpleInterface sim=new SimpleInterface();
int b=Program1.a;//Interface variables by default Static,final,public so accessing by classname.variablename
System.out.println(b);
//System.out.println(a);//we can access directly in s.o.pln
//System.out.println(Program1.a);
sim.show();
sim.display();
	}



}
