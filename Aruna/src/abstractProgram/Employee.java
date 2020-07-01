package abstractProgram;
//An abstract class is a class that is declared abstract —
//it may or may not include abstract methods. 
//Abstract classes cannot be instantiated, but they can be subclassed.
abstract public class Employee 
{
private int empid;
private String empname;
private String empaddress;

abstract double computePay(double payroll);//
 
 
public Employee(int empid, String empname, String empaddress) {
	System.out.println("Construct an Employee");
	this.empid = empid;
	this.empname = empname;
	this.empaddress = empaddress;
}
public void mail() 
{
	System.out.println("Employee Address:    "   + getEmpname() + "   " +getEmpaddress());
	System.out.println(   );
	
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}



}
