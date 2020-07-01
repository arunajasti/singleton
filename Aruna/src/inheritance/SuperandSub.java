package inheritance;

public class SuperandSub {

	public static void main(String[] args)
	{
		Sub sb=new Sub();
		//sb.setName("parent class string name as private");
		//System.out.println(sb.getName());
		
		sb.show();//parent class method
		sb.print();// sub class method
		

	}

}
