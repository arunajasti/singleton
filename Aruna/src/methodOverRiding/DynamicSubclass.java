package methodOverRiding;

public class DynamicSubclass extends DynamicSuperclass
{
	public  void dog()//  Method Overridden
	{
	//super.dog();//call the super class dog()//in o/p first BARK
		System.out.println("WOOF");//next WOOF  ,next cat() invoke MEOW because we refer childclass object to superclas reference so there is no horse() in superclass
		}
	public void horse()
	{
		System.out.println("NEIGH");
		
	}
}
