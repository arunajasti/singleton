package methodOverloading;
//Here MethodOverloading with same parameters but different parameters
public class MethodOverloading2
{
public void add(int a,int b)//same method name add but here 2 parameters
{
	int c=a+b;
System.out.println("a+b= " + c);
}

public void add(int a,int b,int c)////same method name add but here 3 parameters
{
	int d=a+b+c;
	System.out.println("a+b+c= " +d);
	}
public  double add(double a,double b)////different data type(double) add but same 2 parameters
{
	double c=a+b;
	return c;
	}
	public static void main(String[] args)
	{
		MethodOverloading2 mo=new MethodOverloading2();
		mo.add(2, 3);
		mo.add(2, 3,4);
		mo.add(3,4 );
		double result=mo.add(2.0,3.0);
		System.out.println("Add with data type Double: " + result);
	}

}
