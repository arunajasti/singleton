package javaINNERclasses;

public class OuterclassMain {

	public static void main(String[] args) 
	{
		
		Outerclass outerobject=new Outerclass();//instiates of  an object  of outer class
		Outerclass.Innerclass innerobject = outerobject.new Innerclass();//instiates of an object of innerclass
		int num=innerobject.getValue();
		System.out.println("Inner getValue() : "+ num);
		System.out.println("Name is:"+ innerobject.name);
		outerobject.display();
		
	}

}
