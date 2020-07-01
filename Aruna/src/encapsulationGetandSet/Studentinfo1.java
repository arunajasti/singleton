package encapsulationGetandSet;

public class Studentinfo1 {

	public static void main(String[] args)
	{
		Student1 stu=new Student1();
		stu.setRollno(1);
		stu.setFirstname("aruna");
		stu.setLastname("latha");
		stu.setAddress("4967 N 32nd st Apt# 3A");
		System.out.println("student roll no: "+stu.getRollno() + " student Firstname: " +stu.getFirstname());
		
	}

	}