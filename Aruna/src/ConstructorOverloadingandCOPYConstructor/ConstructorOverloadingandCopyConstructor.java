package ConstructorOverloadingandCOPYConstructor;

public class ConstructorOverloadingandCopyConstructor
{ 
	String name;
	int age;
	String nation;
	public ConstructorOverloadingandCopyConstructor(String name, int age, String nation) //constryctor with 3 parameters
	{
		
		this.name = name;
		this.age = age;
		this.nation = nation;
		System.out.println("name: " +this.name);
	}
	public ConstructorOverloadingandCopyConstructor(String name,int age)//constructor with 2 parameters
	{
		this.name=name;
		this.age=age;
	}
	//The copy constructor accepts a reference to its own class as a parameter.
	//A COPY CONSTRUCTOR is a constructor that takes only one argument which is of the type as the class in which the copy constructor is implemented.
	//class ConstructorOverloadingandCopyConstructor  and it has a constructor called copy constructor which expects only one argument of type ConstructorOverloadingandCopyConstructor
	
	public ConstructorOverloadingandCopyConstructor(ConstructorOverloadingandCopyConstructor mo)//constructor similar to copy constructor
	{                                                                               //parameter is a reference of its own class
		System.out.println("Copy Costructor called");
		name=mo.name;
		age=mo.age;
		nation=mo.nation;
		
	}
@Override
	public String toString() {
		return "MethodOverloading [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}

public static void main(String args[])
{
	ConstructorOverloadingandCopyConstructor m1=new ConstructorOverloadingandCopyConstructor("Aruna",31,"Indian");
	ConstructorOverloadingandCopyConstructor m2=new ConstructorOverloadingandCopyConstructor("rama",31);
	ConstructorOverloadingandCopyConstructor m3=new ConstructorOverloadingandCopyConstructor(m1);//object  m1 as argument

	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);
	
}
	

}
