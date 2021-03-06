package own;
//object  is created when it is loaded to the memory by JVM.
public class EagerSingleton {
	private static EagerSingleton obj = new EagerSingleton();
	
	private EagerSingleton() {
		System.out.println("Eager Singleton Constructor");
	}
	
	public static EagerSingleton objectCreationMethod() {
		return obj;
	}

public void display(){
System.out.println("display() invoke");
}

	public static void main(String[] args) {
	EagerSingleton myobj = EagerSingleton.objectCreationMethod();
	myobj.display();

	}

}
