package encapsulationGetandSet;

public class Student
{
	private int rollno;
	private String firstname;
	private String lastname;
	private String address;
	


public Student(int rollno, String firstname, String lastname, String address) {
	super();
	this.rollno = rollno;
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
}



@Override
public String toString() {
	return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
			+ "]";
}

}
