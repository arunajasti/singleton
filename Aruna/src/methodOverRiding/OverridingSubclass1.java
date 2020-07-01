package methodOverRiding;

public class OverridingSubclass1 extends OverridingSuperclass1
{
	String Address;
	public void print()
	{
		System.out.println("Student Information");
		}
public void details()//Method Overridden 
{
	Rollno=1;
	Name="Aruna";
	Age=31;
	Address="4967 N 32 nd st,Apt #3A";
	//System.out.println(" Rollno= " + Rollno + " , " +" Name= " + Name +" ,"+" Age= " + Age + "," + "Address=" + Address);
	}
@Override
public String toString() {
	return " Rollno= " + Rollno + " , " +" Name= " + Name +" ,"+" Age= " + Age + "," + "Address=" + Address + "";
}

}
