package inheritance;

public class Sub extends Super
{
	String name;
	public void print()
	{
		super.setName("parent class string name as a private");//this super keyword refers to call superclass propertieS
		//super.name="parent class";
       this.name="child";//subclass name
		System.out.println("Subclass");
		System.out.println("Name: " + super.getName() + " and " + name);
		//System.out.println(super.name + " and " + name);
	}

}
