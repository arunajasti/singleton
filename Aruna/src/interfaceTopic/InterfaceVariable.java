package interfaceTopic;
interface variable1
{
	int x=10;//we should intialise the variable at time of declaration in interface
}
interface variable2
{
	int x=20;//variable x is same in interface variable1,variable2 so the complier will confuse which interface variableis calling
	              //so we can resolve the problem by using interface name
	int y=100;
	}
public class InterfaceVariable implements variable1,variable2 {

	public static void main(String[] args) 
	{
//System.out.println(x);//reference to x is ambiguous both variables are x
System.out.println(y);//100

System.out.println(variable1.x); //10   //Variable names conflicts can be resolved by interface name 
System.out.println(variable2.x);//20

	}

}
