package methods;
//Here 2 different classes 1)main class(MethodUsingTwoClasses) 2)Example
//if we want access the method in example first we can crate an object of example an then call method in main()
public class MethodUsingTwoClasses {

	public static void main(String[] args)
	{
		Example ex=new Example();//create an object for class Example
		ex.show();//method invoke(call)
	}
	
}
class Example
{

public void show()
{
	System.out.println("Hai");
	}
}

	
