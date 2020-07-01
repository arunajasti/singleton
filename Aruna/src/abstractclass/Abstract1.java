package abstractclass;
abstract class program
{
	int data=10;
	abstract  void print();
	public  static  void display()
	{
		System.out.println("Abstract class implemnted method");
	}

}
public  class Abstract1 extends program { //using Inheritance here
	void print() 
	{
		//super.display();// super keyword using to call super class methods
		System.out.println("subclass to  override the method"+data );
	}


public static void main(String[] args) {
	Abstract1 ab=new Abstract1();
	ab.print();
	program.display();//Static method to call by using classname
}




}
