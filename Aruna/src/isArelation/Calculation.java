package isArelation;
//using the object of the subclass you can access the members of a superclass.
//here Calculation class is subclass & Arithmatic class is super class
//if we want access the fields and methods of Super class we can create the object of Sub class
public class Calculation extends Arithmatic 
{

public void multiplication(int x,int y)
{
	
z=x*y;
System.out.println("The multipliction is : "+z);
}
	public static void main(String[] args) 
	{
int a=10;
int b=20;
Calculation cal=new Calculation();//create the object of Sub class//is A relation


cal.addition(a, b);
cal.subtraction(a, b);
cal.multiplication(a, b);

	}
	
}
	

	
	