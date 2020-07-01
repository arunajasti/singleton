package abstractclass;
public class Abstractclass1 //main is different class
{
	public static void main(String args[])
	{
		program1 pr=new program1()
		{
			void display()//Implement the Abstract inside main()
			{
				System.out.println("This is abstract class method in Main ()");
			}
		};//end of abstract  method declaration
		pr.display();
		
		Class1 c=new Class1();
		c.print();
		pr.show();
	}

}
