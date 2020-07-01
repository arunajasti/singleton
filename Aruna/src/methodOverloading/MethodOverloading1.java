package methodOverloading;
//Method Overloading with same parameters but different data types
public class MethodOverloading1 
{
	public int add(int x,int y)//method data type is INT & 2 PARAMETERS
	{
		int z=x+y;
		return z;
	}
	public float add(float x,float y)//method data type is FLOAT & 2 PARAMETERS
	{
		float z=x+y;
		return z;
	}

	public static void main(String[] args)
	{
		MethodOverloading1 mo=new MethodOverloading1();
		
		int sum=mo.add(2, 3);
		System.out.println("Int Add method: " + sum);
		
		
	float addition=mo.add(2, 3);
		System.out.println("Float Add method: " + addition);

	}

}
