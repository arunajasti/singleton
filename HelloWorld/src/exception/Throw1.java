package exception;

class Invalidage extends Exception
{
	int age;
	public Invalidage(int age)
	{
		this.age=age;
	}
	@Override
	public String toString() {
		return "Invalidage [age=" + age + "]";
	}
	
/*public String toString()
	{
		return "below 18 years";
	}*/
}
class StudentAge
{
	private int age;
	private String name;
	public void enter(String name,int age)
	{
		try
		{
		if(age<18)
		{
			throw new Invalidage(age);
			
		}
		else 
		{
			this.name=name;
			this.age=age;
		}
	}
	
	    
	catch(Invalidage e)
	{
		//System.out.println("below 18 years");
		//System.out.println("Invalid age");
		System.out.println(e);
	}
	}
	public void show()
	{
		 System.out.println("Name is.."+name);
		 System.out.println("Age is .."+age);
	}
	
}



public class Throw1 {

	public static void main(String[] args) 
	{
		StudentAge s1= new StudentAge();
		s1.enter("Rikhil",79);
		System.out.println("s1 values");
		s1.show();
		StudentAge s2= new StudentAge();
		s2.enter("Arjun",9);
		System.out.println("s2 values");
		s2.show();
	}

}
