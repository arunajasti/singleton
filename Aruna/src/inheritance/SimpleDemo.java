package inheritance;

public class SimpleDemo {

	public static void main(String[] args) 
	{
		SimpleSub sub=new SimpleSub();
		
		sub.sum(3,4);//super class method invoked
		sub.add(2, 3);//subclass method invoked
		
		

	}

}
