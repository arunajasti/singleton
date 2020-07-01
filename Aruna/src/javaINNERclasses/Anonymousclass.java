package javaINNERclasses;

abstract class Anonymous1
{
	int date=5;
	static  int value=10;
	abstract void eat();//if we declare the method abstract the class will be abstract
}
public class Anonymousclass {
	public static void main(String[] args) 
	{
		Anonymous1 anony=new Anonymous1()//create an instance of Anonymous1 class by using The NEW operator
	{
public void eat()//Anonymous1 method to implement in Anonymousclass
{
	System.out.println("NICE FRUITS");
System.out.println("STATIC field: " + Anonymous1.value);//static field we can access directly by classname we don't need use anonymous object
	//System.out.println(" INT field : "+anony.date);annoy.date will not work because the NEW operator synatx is not completed at here
}
	};//end of Anonymous class syntax with semicolon;
		
				anony.eat();// calling the eat()
				System.out.println(" INT field : "+anony.date);
	}
}