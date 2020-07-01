package studentINFObyusingINHERITANCEbyusingTOSTRINGMETHOD;

public class Student extends Person
{
private double fee;

public Student(int id,String name,double fee) 
{
	super(id,name);
	this.fee=fee;
}

public void getFee()
{
	if(fee>1000)
	{
		 fee= 100+fee;
	}
	}


@Override
public String toString() {
	return "Student [id=" + getId() + ", name=" + getName() +", fee=" + fee + "]";
}







}
