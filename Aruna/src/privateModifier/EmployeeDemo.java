package privateModifier;

public class EmployeeDemo {

	public static void main(String[] args)
	{
//in order to access class members
//we need to create an object of the class		
		
Employee emp=new Employee(100, "aruna", "latha", 250000);
Employee emp1=new Employee(200,"rama","jasti",500000);

//println wont work to print the values 
//thats why use toString() method to print the values
System.out.println(emp.toString());//tostring() having behaviour call it is automatically executed when we use the object inside  s.o.pln.

System.out.println(emp1.toString());

//System.out.println(emp);//this line same as s.o.pln(emp.toString());
//System.out.println(emp1);////this line same as s.o.pln(emp1.toString());

}

}
