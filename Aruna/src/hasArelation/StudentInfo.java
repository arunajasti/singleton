package hasArelation;

public class StudentInfo {

	public static void main(String[] args) 
	{

		StudentAddress s2=new StudentAddress("4967 N 32nd St,Apt #3A","Lincoln","NE",68504);//passing the argumnets to StudentAddress constructor
		
		Student s1=new Student(1,s2);//passing rollno and StudentAddress to Student constuctor

		System.out.println("this S1 is Student: "+s1);//thus s.o.pln for studentclass
		System.out.println("This S2 is Student Adress: "+ s2);//studentaddress
		
		//System.out.println(s1.toString());

	}

}
