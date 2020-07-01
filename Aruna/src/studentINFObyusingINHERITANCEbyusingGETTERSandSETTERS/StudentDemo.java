package studentINFObyusingINHERITANCEbyusingGETTERSandSETTERS;



public class StudentDemo
{
	public static void main(String[] args) 
	{
		Student stu=new Student(1,"aruna",2700);
		Trainer trn=new Trainer(100,"rama",36000,1000);
		System.out.println("Student Information");
		System.out.println(  stu.getId());
		System.out.println( stu.getName());
		System.out.println(stu.getFee());
		System.out.println("After  changing names");
		stu.setName("sunitha");//change the name
		System.out.println(  stu.getId());
		System.out.println( stu.getName());
		System.out.println(stu.getFee());
		System.out.println("Trainer information");
		System.out.println(trn.getId());
		System.out.println(trn.getName());
		    System.out.println(trn.getSalary());
		//trn.setSalary(1000);
		System.out.println(trn.bonus);//here we didn't use get() for bonus becaiuse bonus isnot PRIVATE field

	}
}
