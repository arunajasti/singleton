package abstractANDinterface;

interface A
{
	void a();
	void b();
	void c();
}
interface B
{
	void d();
}

//Creating abstract class that provides the implementation of one method of A interface  
//if we are not declare the class as abstract we should add all Unimplemeted methods
abstract class Abstractclass implements A,B //a abstract can implement the interface
{

	public void c() 
	{
		System.out.println("I am C");
	}
}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
public class Absimpint extends Abstractclass
{

	public void a() 
	{
		System.out.println("I am A");
	}

	public void b()
	{
		System.out.println("I am B");
	}

	public void d() 
	{
		System.out.println("I am D");
	}


}


