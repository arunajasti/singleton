package useArelation;


public class Salary extends Employee
{
	public void display()//here method is Salary class using an object is Employee class
	{
double bonus=25000.0;
Employee emp=new Employee();//A method of one class is using an object of another class //
                                                    //the relationship between these two classes is known as Uses-A relationship.
double total=emp.salary+bonus;
System.out.println("total salary: "+total);
}
}