package javaINNERclasses;
public class Methodinnerclass
{
	int sum;
	public void print()
	{
		System.out.println("outer printer method"); 
		
	}
	public void display()
	{
		class Methodinner//inner class is in method of outer class
		{
			public void print()
			{
				sum=10;
				System.out.println("inner method: " + sum  );
			}
		}//END OF INNER CLASS
		
		Methodinner inner=new Methodinner();
		inner.print();
		
	}
	public static void main(String[] args) 
	{
		Methodinnerclass met=new Methodinnerclass();
		met.display();
met.print();
	}

}


