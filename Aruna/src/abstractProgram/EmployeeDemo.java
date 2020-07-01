package abstractProgram;

public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Salary sal=new Salary(1, "aruna", "4967", 36000);
		Employee e=new Salary(2,"rama","north 32nd st,Apt # 3A",27000);//run time polymorphism
//employee(Super class) reference is assigning Salary (Sub class)object
		System.out.println("Mail checking using salary reference: ");
		sal.mail();
		sal.display();
		
		System.out.println("Mail checking using Employee reference: ");
		e.mail();
      // e.display();we can't use super class reference for newly created subclass methods
		
		double pay1=e.computePay(100.00);
       System.out.println(pay1);

		double pay=sal.computePay(2000.00);
		System.out.println(pay);
		
		//System.out.println("Compute pay salary reference: " +sal.computePay(2000) );
	}

}
