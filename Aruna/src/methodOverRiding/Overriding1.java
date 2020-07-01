package methodOverRiding;

public class Overriding1 {

	public static void main(String[] args)
	{
		OverridingSubclass1 sub=new OverridingSubclass1();
		//SuperclassOverriding1 sup = new SubclassOverriding1();//this line called as Dynamic(Run-time) polymorphism
		//when a parent class reference is used to refer to a child class object.
		//sup.details()
		sub.print();
		sub.details();
		System.out.println(sub);

	}

}
