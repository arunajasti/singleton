package wrapper;

public class Wrapper2 {

	public static void main(String[] args)
	{//After java 1.5/5 Boxing and Unboxing became automatic. You can directly assign the primitive as an object of wrapper class.
		  //Integer i=10;
		
		Integer obj1=10;//directly assign the primitive as an object of wrapper class
		Integer obj2=10;
		Integer obj3=50;
		Float f=2.25f;
		
		//compare obj1 and obj2
		System.out.println("comparing obj1 & obj2: "+obj1.compareTo(obj2));
		System.out.println("comparing obj1 & obj2: "+obj2.compareTo(obj3));
		
		//boolean equals
		System.out.println("equally obj1 & obj2 "+obj1.equals(obj2));// if values are sameit returns true 
		System.out.println("Compare obj2 & obj3 "+obj2.equals(obj3));//if values are not equal it reurns false
		
		//addition of Integer with Float;
		
		Float add=obj1.floatValue()+f;//obj1.floatvalue() is returns obj1 value as a float
		System.out.println("add Integer & Float is: " + add);

	}

}
