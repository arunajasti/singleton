package studentINFObyusingINHERITANCEbyusingGETTERSandSETTERS;

public class Trainer extends Person
{
	private double salary;
      int bonus;//here we don't creste GETTERS&SETTERS for bonus because it is not PRIVATE field
      
	public Trainer(int id, String name,double salary,int bonus)
	{
		super(id, name);
		this.salary=salary;
		this.bonus=bonus;
		//setSalary(salary);
	}

	public double getSalary() 
	{
		double basesalary=this.salary;
		//return salary;
		return(basesalary+basesalary*(bonus/100));
	}
	/*public void setSalary(double basesalary) 
	{
		 basesalary=this.salary;
		if(basesalary>0.0)
		{
			basesalary=basesalary+salary;
		}
		
	}*/
	
		

	

	/*@Override
	public String toString() {
		return "Trainer [id=" + getId() + ", name=" + getName() +",salary=" + getSalary() + "]";
	}*/

}
