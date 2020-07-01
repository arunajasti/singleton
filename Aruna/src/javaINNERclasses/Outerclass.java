package javaINNERclasses;

public class Outerclass
{
	private int data =5;
//inner class can access all the members of outer class including private data members and methods.
	public class Innerclass//this is inner classs
	{
		int value=data;// Directly uses the instance variable a from Outer class
		String name="ARUNA";
		
		public int getValue()//Inner method
		{ 
			return value;
		}
	}//END of INNER CLASS
	
	public void display()//outer method
	{
		System.out.println("Outerclass method");
	}

}
