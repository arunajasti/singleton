package methodOverRiding;

public class OverridingSuperclass1
{
	int Rollno;
	String Name;
	int Age;
	
	
	public void details()
	{
		Rollno=1;
		Name="Aruna";
		Age=31;
		//System.out.println(" Rollno= " + Rollno + " , " +" Name= " + Name +" ,"+" Age= " + Age );
	}

	@Override
	public String toString() {
		return "SuperclassOverriding1 [Rollno=" + Rollno + ", Name=" + Name + ", Age=" + Age + "]";
	}
	

}
