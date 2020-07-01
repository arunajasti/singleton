package inheritance;

public class ConstructorSub extends ConstructorSuper
{
String name;
public ConstructorSub(String n1,String name)//subclass constructor
{
	super(n1);//passing argument to parent class constructor
	this.name=name;
	}
public void details()
{
	System.out.println(super.name + " and " +name);
	}
}
