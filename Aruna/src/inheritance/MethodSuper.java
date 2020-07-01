package inheritance;
//Example of Child class refering Parent class methods using super keyword
public class MethodSuper 
{
	private String name;
	public void details()
	{
		setName("parent method");
		System.out.println("parent method details : "+ getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
