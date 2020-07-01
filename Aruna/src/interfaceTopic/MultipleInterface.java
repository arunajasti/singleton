package interfaceTopic;
interface A
{
	public void show();
	public void display();
}

interface B
{
	public void show();
}

public class MultipleInterface implements A,B //multiple inheritance is possible in interface.Here a class implements two interfaces classes(A,B)
{
	@Override
	public void show()
	{
		System.out.println("HAI");
	}
	@Override
	public void display() 
	{
System.out.println("H R U?");
	}

	public static void main(String[] args) 
	{
		MultipleInterface mul=new MultipleInterface();
		mul.show();
		mul.display();
	}



}
