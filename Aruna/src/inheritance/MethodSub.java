package inheritance;

public class MethodSub extends MethodSuper
{
String name;
public void details()
{
	super.details();//calling super class method by using super keyword
	name="child method";
	System.out.println("Sub Method details: "+name);
	}
}
