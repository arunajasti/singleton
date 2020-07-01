package staticKeyword;

public class StaticSubclass extends StaticSuperclass
{
	public void show()
	{
		System.out.println("This is NON-STATIC  SHOW()method in Subclass");

		//StaticSuperclass sup=new StaticSuperclass();//WE DON'T CREATE AN OBJECT OF SUPER CLASS to access Static method in Subclass
		//sup.display();
		
		StaticSuperclass.display();//classname.Staticmethod() name
		super.print();

			}
	public static void read()
	{
		//super.print(); cannot use super in static method/in MAIN()
		
	}
	
	}
	
	
	
