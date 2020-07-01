package studentINFObyusingINHERITANCEbyusingGETTERSandSETTERS;

public class Student extends Person
{
	private double fee;

	public Student(int id,String name,double fee) 
	{
		super(id,name);
		this.fee=fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) 
	{
		this.fee = fee;
	}

	
	/*public String toString() {
		return "Student [id=" + getId() + ", name=" + getName() +", fee=" + fee + "]";
	}*/

}
