package constructor;

public class Constructor2 {
	String name;
	
	public Constructor2()
	{
		System.out.println("Constructor: " + name);
	}
	public String Name(String n)
	{
		name=n;
		return name;
	}
	

	public static void main(String[] args)
	{
		Constructor2 con=new Constructor2();
		String n1=con.Name("Aruna");
		
		System.out.println("Method String Name: " + n1);

	}

}
