package staticNestedClass;

public class Nestedclass {
	public void fruit()
	{
		System.out.println("Nice Fruits");
	}

	static class Inner   //Static Nested class
	{
		public void eat()
		{
			System.out.println("Eat food");
		}
	}//End static Nested class
	public static void main(String[] args)
	{
		Nestedclass nes=new  Nestedclass();//this instance is used for to access outer class methods
		//Nestedclass.Inner inner=nes.new Inner();//// this  lines we used in INNER CLASS  to access the Inner class Method not in Static Nested classes
Nestedclass.Inner inner=new Nestedclass.Inner();//this instance used for to access for Static Nested CLass
		inner.eat();
		nes.fruit();
	}

}
