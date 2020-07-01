package hasArelation;

public class Student 
{
private int rollno;
//Student has Address so, student class has an instance of StudentAddress class as its member.

StudentAddress address;//HAS-A-RELATION OF address
//there are 2 classes Student & StudentAddress



public Student(int rollno, StudentAddress address) 
{
	
	this.rollno = rollno;
	this.address = address;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", address=" + address + "]";
}



}
