package ConstructorOverloadingandCOPYConstructor;

public class Employee
{
	private String name;
	private int id;
	private Departmant departmant;//HAS-A RELATION
	//constructor
	public Employee(String name, int id,Departmant departmant) 
	{
		this.name = name;
		this.id = id;
		this.setDepartmant(departmant);
	}
	//COPY CONSTRUCTOR
	public Employee(Employee emp,Departmant departmant) 
	{
		
		this.name = emp.name;
		this.id =emp. id;
		this.departmant=departmant;
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
	public Departmant getDepartmant() {
		return departmant;
	}
	public void setDepartmant(Departmant departmant) {
		this.departmant = departmant;
	}
	@Override
	public String toString() {
		return "Employee Name=" + name + ", Employee ID=" + id + ",  "+departmant+"" ;
	}
	
	
}
