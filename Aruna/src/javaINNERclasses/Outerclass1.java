package javaINNERclasses;
//i can write same program//Accessing the Inner class with in outerclass method 
//creating innerclass object in outerclass method
//Innerclass inner=new Innerclass();
//inner.print();

public class Outerclass1
{
	private int sum;
	public void print()
	{
		System.out.println("Outer Print Method ");
	}
	public class Innerclass1 extends Outerclass1//this is inner class
	{
		public int add()
		{
			int a=10;
			int b=5;
			sum=a+b;
			return sum;
		}
		public void print()//Method ovverridden by innerclass(subclass)
		{
			super.print();//super is used to refer to call superclass method
			System.out.println("Inner class print method");
		}
	}
	public void display()//outer method
	{
		Innerclass1 inner=new Innerclass1();//create innerclass object in outer class method
		int addition=inner.add();
		System.out.println("Inner method add: " + addition);
		inner.print();
		System.out.println("Outerclass  display method");

	}


}


