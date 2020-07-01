package hasArelation;

public class SampleMain {
public void print()
{
	System.out.println("print the method");
	}
	public static void main(String[] args)
	{
int a,b;
a=30;b=20;
//This is HAS-A-Relation
Sample1 sam=new Sample1();//Create an object of Sample1 in SampleMain class 
//SampleMain smain=new SampleMain();
//smain.print();
sam.read();

int c=sam.show(a,b);
System.out.println("the value of c is: "+c);


	}

}
