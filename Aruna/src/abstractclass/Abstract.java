package abstractclass;
abstract class sample
{
	static int data=10;//	Static variable call directly with ClassName
	String Name="Aruna";//Non-Static Variable call by using object
	
	public void display()
	{
		System.out.println("Abstract class implemnted method");
	}
	abstract void print();
	}



public class Abstract {  //it is not inheritance
	sample s=new sample() //it this method implemt inside main()//s.print(),s.dispaly()
	{
		void print()
		{
			data=20;
			System.out.println("this is print()implemeting  in main class "+ sample.data);
			System.out.println("this is print()implemeting  in main class "+ s.Name);
			
			}
		}; 
	public static void main(String[] args) //main()
	{
		
		
Abstract ab=new Abstract();
ab.s.print();
ab.s.display();//

	}

}
