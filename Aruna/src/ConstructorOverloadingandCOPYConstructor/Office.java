package ConstructorOverloadingandCOPYConstructor;

public class Office {

	public static void main(String[] args) 
	{
	Departmant dep1=new Departmant("FINANCE",1);
	System.out.println( dep1);
	
	Employee emp1=new Employee("Ram",1,dep1);
	Employee duplicate=new Employee(emp1, dep1);//copy constructor invoke
	
	System.out.println("Original Employee:" +emp1);
	System.out.println("Duplicate Employee: "+ duplicate);
	
	System.out.println("After change the names");
	duplicate.setName("aruna");
	duplicate.setId(2);
	emp1.getDepartmant().setName("HR");//to change departmant name by using Employee(emp1) object .getDepartmantclass.set the name
	emp1.getDepartmant().setId(2);
	System.out.println("Duplicate Employee: " + duplicate);
	
	
	}

}
