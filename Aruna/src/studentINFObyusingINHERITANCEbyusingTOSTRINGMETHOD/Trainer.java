package studentINFObyusingINHERITANCEbyusingTOSTRINGMETHOD;

public class Trainer extends Person
{
private double salary;
private int bonus;
public Trainer(int id, String name,double salary,int bonus)
{
	super(id, name);
	this.salary=salary;
	this.bonus=bonus;
	
}

public double getSalary() //here adding bonus into salary that's why using getsalary() for totla amount salary+bonus.
{
	double basesalary=this.salary;
	//return salary;
	return(basesalary+basesalary*(bonus/100));
}



@Override
public String toString() {
	return "Trainer [id=" + getId() + ", name=" + getName() +",salary=" + getSalary() + ",bonus="+bonus +"   ]";
}
}
