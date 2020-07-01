package constructor;
//if we not create any parameter constructor the compiler will create default constructor by explicitly
//when we create parameter constructor the compler will not create default constructor
//if we want we can declare default constructor
//in this program there is one parameter constructor
//so constructor con=new constructor will not invoke;
//constructor con =new constructor("aruna") wiil invoke because the constructor is parameter so we have pass the value
public class Constructor 
{
	private String name;

	public Constructor(String n)//parameterized constructor
	{
		name=n;
	}

	
	@Override
	public String toString() {
		return "Name=" + name + " ";
	}

	public static void main(String[] args)
	{
		//Constructor con=new Constructor();	//this is not invoke because in class there is no default constructor declare 
		Constructor con=new Constructor("aruna");//parameter constructor invoke
		System.out.println(con);

	}

}
