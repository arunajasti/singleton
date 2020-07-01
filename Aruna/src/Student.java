import hasArelation.StudentAddress;

public class Student
{
	private int rollno;
	private StudentAddress address;//HAS-A-RELATION OF address
	//there are 2 classes Student & StudentAddress

//i want roll no automatically generated
	private static int counter = 0;

	public Student( String streetname,String city,String state,int zipcode) 
	{
		//super();
		//this.rollno = rollno;
		this.rollno=++counter;
		this.address = new StudentAddress(streetname,city,state,zipcode);
		
	}

	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", address=" + address + "]";
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public StudentAddress getAddress() {
		return address;
	}



	public void setAddress(StudentAddress address) {
		this.address = address;
	}



	

}
