package abstractProgram;

public  class Salary  extends Employee{
	
private double salary;
	
public Salary(int empid, String empname, String empaddress, double salary)
{
	super(empid, empname, empaddress);
	this.setSalary(salary);
	
}

public double computePay(double newsalary) {
    System.out.println("Computing salary pay for  " + getEmpname());
    return  newsalary/10;
  }
public void display()
{
	System.out.println("Name: "+ getEmpname() +" , " + salary);}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) 
{
	this.salary = salary;
}

@Override
public String toString() {
	return " [empid=" + getEmpid() + ", empname=" + getEmpname() + ", empaddress=" + getEmpaddress() +", salary=" + salary + "]";
}
}
