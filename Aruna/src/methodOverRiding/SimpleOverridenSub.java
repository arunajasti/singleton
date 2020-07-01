package methodOverRiding;

public class SimpleOverridenSub extends SimpleOverridenSuper
{
	public void sum(int a, int b)//method ovverriden 
	{
		//super.sum(3, 4);//this super calls super class sum()
		System.out.println("sub class: " + (a+b));
}
}