package exceptionThrow;
class InvalidData 
{
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)  //here using throws
	{
		if (age<18 || age >59)
		{
throw new IllegalArgumentException("INVALID DATA");
		}
		else
			System.out.println("Valid data");

	}
}



public class UserDefinedThrow2 {

	public static void main(String[] args) 
	{
		InvalidData in=new InvalidData();
		int age=Integer.parseInt(args[0]);
		
		
		try{
			in.setAge(age);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		int a=in.getAge();
		System.out.println("age is : "+ a);
		
	}

}
