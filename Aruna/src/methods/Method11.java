package methods;
//Here using 2 classes 
//if we want access class addsum members we need to crate an object for that class in main() class
public class Method11 {

	public static void main(String[] args) 
	{

addsum s=new addsum();//create an object for class addsum
s.add();


	}

}
class addsum
{
int a=2;
int b=3;
	public void add()
	{
		int c=a+b;
		System.out.println("addition of a+b is: " +c);
	}
	}
