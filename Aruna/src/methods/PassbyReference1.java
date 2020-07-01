package methods;

public class PassbyReference1 {

	public static void main(String[] args)
	{
		Dog ex=new Dog("pur");
		System.out.println("Before modify: "+ex.getName());
		
           modifyname(ex);//pass by reference
           System.out.println("After modify: "+ex.getName());
	}

	private static void modifyname(Dog dogname) 
	{

dogname.setName("max");
		System.out.println("");
	}
}
class Dog
{
	protected String name;
public Dog(String name)//constructor//generate fields
{
    this.name = name;
}
public void setName(String name) {
    this.name = name;
}
public String getName() {
    return this.name;
}





}


