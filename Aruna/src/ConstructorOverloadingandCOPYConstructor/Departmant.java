package ConstructorOverloadingandCOPYConstructor;

public class Departmant 
{
	private String name;
	private int id;
	//constructor
	public Departmant(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	//COPY CONSTRUCTOR
	public Departmant(Departmant dep) 
	{
		
		this.name = dep.name;
		this.id =dep. id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return " Departname=" + name + ",  Department ID=" + id + " ";
	}
	
}
