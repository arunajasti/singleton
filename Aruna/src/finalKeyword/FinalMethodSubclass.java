package finalKeyword;

public class FinalMethodSubclass extends FinalMethodSuperclass
{
	private String college="K L C College";
	
	public FinalMethodSubclass(String name, int age) 
	{
		super(name, age);
		System.out.println("This is Subclass constructor");
		}

	//public void display()//Cannot override the final method from FinalMethodSuperclass(SUPER CLASS)
	public void print()
	{
		System.out.println("SubClass Student Information: " + name +" ,"+ age+" ," + college);
	}
}
