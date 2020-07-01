package javaINNERclasses;

public class InnerclassPrivate 
{
int sub;
public void print()
{
System.out.println("Outer class print method");	
}

private class InnerPrivate  extends InnerclassPrivate//Inner class declared as a Private
{
	public void subtract()
	{
		int a = 3,b=1;
		sub=a-b;
		System.out.println("Inner class subtract method: " + sub);
		}
	}//END OF INNER CLASSS

public void display()//OUTER CLASS METHOD
{
	InnerPrivate inner= new InnerPrivate();
	inner.subtract();
	inner.print();//here we can invoke the outerclass print  methodby using innerclass instance
	}
}
