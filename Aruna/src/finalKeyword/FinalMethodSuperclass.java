package finalKeyword;

public class FinalMethodSuperclass 
{
	
		String name;
		int age;
	final String college="RVR & JC";
	 

	public  FinalMethodSuperclass(String name, int age)
	 {
		
		this.name = name;
		this.age = age;
		System.out.println("This is Superclass constructor");
	}
	public final void display()
	 {
		System.out.println("SuperClass Student Information: " + name +" ,"+ age+" ," + college);
	 }
	}

