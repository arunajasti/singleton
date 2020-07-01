package polymorphism;
//Run time polymorphism program
 class Addition
{

	public void sum(int a,int b)
	{
		System.out.println("The sum  of super class is.."+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("The sub is.."+(a-b));
	
	}

	public void div(int a,int b)
	{
		System.out.println("The div is.."+(a/b));
	}
}
class Multiplication extends Addition       //subclass
{
	public void sum(int a,int b) //sum is overrridden method
	{
		System.out.println("The sum of sub class is.."+(a+b));
	}
	public void mul(int a,int b)
	{
		System.out.println("The mul is.."+(a*b));
	}
}

public class Runtime {

	public static void main(String[] args) 
	{
		
		//runtime polymorphism
		//assign superclass reference to subclass object
		//In this case JVM(java virtual machine) decides which method to call at runtime 
		//that’s why it is known as runtime or dynamic polymorphism.
		Addition ref1=new Addition();
		ref1.sum(1, 2);
		ref1.sub(4, 2);
		ref1.div(20, 10);
		
		 //class Addition(superclass) can hold refernce of an object of  class Mulitiplication(subclass)
         Addition ref2 = new Multiplication();
         ref2.sum(10, 20);// overridden method call(sub class)
         ref2.sub(100, 20);// non-overridden method(superclass method)
         ref2.div(20, 5);//  non-overridden method(superclass method)
         
         //ref2.mul(10,20);//newly created in subclass because superclass 
                           //doesn't have any idea of mul method
        
	}

}
