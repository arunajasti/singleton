package day.two;

public class Unary {

	public static void main(String[] args)
	{
	
		int a,b;
		a=1;
		b=10;
		
		System.out.println("the value of a++ is " +(a++));
		// the value 0f a++ is 10 in o/p but it increment the value.but we check it whether it is incr or not 
		// so that's why we write another s.o.pln of (a)
		System.out.println("the value of a++ is " +(a));// the value of a++ is 11.
		//
		System.out.println("the value of ++a is " +(++a));
		System.out.println("the value of b-- is " +(b--));
		System.out.println("the value of --b is " +(--b));
		
		
		

	}

}
