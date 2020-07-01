package staticKeyword;

public class StaticMethodandVariable {
	  String name ="Rama ";
	static  String company="Kanbay";// static fields can access directly with class name
	
	public static String Name()//Static method
	{	
		/*here we are  creating any  object to access for non-static members class members
		 * String employee= StaticMethodandVariable.name + " , "+ StaticMethodandVariable.company;*/
		StaticMethodandVariable st=new StaticMethodandVariable();
		String employee=st.name + " , " + company;
		return employee;
	}


	public static void main(String[] args)
	{

		//we don't need to create object directly we can access through classname
		String companyinfo=StaticMethodandVariable.Name();
		
		System.out.println("Company Informtion: " + companyinfo);
	}
}
