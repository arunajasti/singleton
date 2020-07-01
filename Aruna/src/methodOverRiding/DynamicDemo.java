package methodOverRiding;

public class DynamicDemo {

	public static void main(String[] args)
	{
		DynamicSuperclass sup=new DynamicSubclass();//parent class refernce is used to refer to subclass object
				sup.dog();// subclass dog called because dog()  is  Overridden method
		
				sup.cat();
		

	}

}
