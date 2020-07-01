package privateModifier;
 public class Employee {

private int id;
private	 String firstname;
private	 String lastname;
private	 double salary;

//click on  rigth-->sources-->generate constructor using fields 

public Employee(int id, String firstname, String lastname, double salary) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
}



	}


