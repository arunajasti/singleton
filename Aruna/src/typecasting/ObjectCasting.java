package typecasting;

class Smell
{
	public void flower()
	{
		System.out.println("All flowers give good smells");
	}
}

public class ObjectCasting extends Smell
{
	public void flower()//method overidden
	{
		System.out.println("Rosy flower gives rose smell");
	}

	public static void main(String[] args)
	{
		Smell s= new Smell();
		ObjectCasting ob=new ObjectCasting();
		
		s.flower();
		ob.flower();
		
		s=ob;    //subclass to superclass it is valid  ob is subclass  s is superclass (implicit casting)  is called Auto UP Casting
		ob.flower();
	
		
		
		ob=(ObjectCasting)s;  //superclass to subclass so use objectcasting of superclass is is explicit casting is called Explicit DOWN Casting
		s.flower();
		
		
		
	}

}
