
public class Studentinfo {

	public static void main(String[] args)
	{
//StudentAddress s2=new StudentAddress("4967 apt 3A","Lincoln","NE",68504);
Student s1=new Student("4967 apt 3A","Lincoln","NE",68504);
Student s2=new Student("521","jeff","MO",65104);
System.out.println(s1);
System.out.println(s2);

System.out.println("values after change");
s1.getAddress().setStreetname("104");//if we want change the values using getter and setter methods
s1.getAddress().setZipcode(68521);
System.out.println(s1);
	}

}
