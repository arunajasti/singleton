package wrapper;

public class Wrapper1 {

	public static void main(String[] args)
	{
		//Integer obj1= Integer.valueOf(10);
	Integer obj1=new Integer(10);//argument may be string or int
	Integer obj2=new Integer("10");//we can declare integer object like this also
	Integer obj3=new Integer(50);  
	Float f=new Float(2.25f);//Float f=new Float("2.25f");
	
	//compare obj1 and obj2
	System.out.println("Compare obj1 & obj2 "+obj1.compareTo(obj2));//if values are same it's returns zero
	System.out.println("Compare obj2 & obj3 "+obj2.compareTo(obj3));//obj2 value is <obj3 so its is -1
	System.out.println("Compare obj2 & obj3 "+obj3.compareTo(obj2));//objj3 value is > obj2 so it's is 1
	
	//boolean equals
	System.out.println("equally obj1 & obj2 "+obj1.equals(obj2));// if values are sameit returns true 
	System.out.println("Compare obj2 & obj3 "+obj2.equals(obj3));//if values are not equal it reurns false
	
	//addition of Integer with Float;
	
	Float add=obj1.floatValue()+f;////obj1.floatvalue() is returns obj1 value as a float
	System.out.println("add Integer & Float is: " + add);
	}

}
