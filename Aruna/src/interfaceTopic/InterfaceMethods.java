package interfaceTopic;
interface add
{
	public int addition(int a,int b);

}
interface sub
{
	public int subtraction(); 
}

public class InterfaceMethods implements add,sub {
	int a=10;
	int b=20;


	@Override
	public int addition(int x,int y)
	{
		
		int z=x+y;
		return z;
	}
	@Override
	public int subtraction() 
	{

		int z=a-b;
       return z;
	}


	public static void main(String[] args)
	{

InterfaceMethods met=new InterfaceMethods();
int result=met.addition(10,15);
System.out.println("Additon method values: " + result);

int res=met.subtraction();
System.out.println("Subtraction values : "+ res);
	}



}
