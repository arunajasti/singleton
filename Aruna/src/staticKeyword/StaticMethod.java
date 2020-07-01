package staticKeyword;
//Note that Static Methods cannot access instance variables. They can access only static variables. 
public class StaticMethod 
{
	String name="Rama";//Non-static  field(Instance variables)
static int count=0;

	 static String display()
	{
		//name; //non-static members cannot access in StaticMethods
		//if we want access non-static fields in static methods by using instance of class
		StaticMethod st=new StaticMethod();
		String employeename=st.name;
		return employeename;
	}
	public void increment()
	{
		count=count+1;
		System.out.println("COUNT IS: " + count);
	}
	
	public static void main(String[] args)
	{

String employeename=StaticMethod.display();
System.out.println("Employee Name: " +employeename);
StaticMethod st1 =new StaticMethod();
StaticMethod st2 =new StaticMethod();

st1.increment();
st2.increment();

//System.out.println("count is : " +st1. count);
//System.out.println("count is : " + st2.count);

	}

}
