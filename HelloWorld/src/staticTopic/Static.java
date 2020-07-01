package staticTopic;

public class Static {
	
	static int age=10;//Static variable
	public void display()
	{
		System.out.println("Age is " +age);
	}
	

	public static void main(String[] args) 
	{
		/*Static obj=new Static();
		obj.display();*/
		
		System.out.println("Age is "+Static.age);//we can access directly <classname.variablename>

	}

}
