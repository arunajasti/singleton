package interfaceSTATIC;
interface one
{
	void display();
	static void add(int a,int b)//static methid is implemented in interface it cannot override 
	{
		int c=a+b;
		System.out.println("Interface Static() is : " + c);
	}
}
public class StaticMethodsinInterface implements one {
	@Override
	public void display() 
	{
//one.add(2,3);//call static method inside display()
System.out.println("Display method");
}
	public static void main(String[] args) {
		one on=new StaticMethodsinInterface();
		on.display();
              one.add(2, 3);
	}

	

}
