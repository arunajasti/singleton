package own;

//object is created only if it is needed
class LazySingleton {
	
	private static LazySingleton obj = null;
	private LazySingleton()//private constructor
	{
		/*private constructor will prevent 
		 * the instantiation of this class directly*/
		System.out.println("Private constructor");
	}
	public static LazySingleton objectCreationMethod(){ //getInstance()
		/*This logic will ensure that no more than
		 * one object can be created at a time */
		if(obj==null){
			obj = new LazySingleton();
		}
		return obj;
	}
	public void display(){
		System.out.println("Singletonclass example executed");
	}


	public static void main(String args[]){
		//Object cannot be created directly due to private constructor 
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
		LazySingleton myobj = LazySingleton.objectCreationMethod();
		myobj.display();
	}
	
}


