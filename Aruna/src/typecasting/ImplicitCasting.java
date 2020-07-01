package typecasting;
//Assigning one data type(primitive) to another data type or one object(derived) to another object is known as casting. Java supports 2 types of casting – 
//data type casting and object casting.

//There are two types of casting,
//1) Primitive Casting. there are 2 types
//  implicit casting(Auto widening),explicit casting(explicit narrowing)
//implicit casting: converting data from small sized data type to big sized data type
//explicit casting:converting data from big sized data type to small sized data type
//2) Derived(object) Casting it is used in hierrachy(inheritance)
//object casting 2 types
//AutoUp Casting  & Explicit Down Casting
public class ImplicitCasting {

	public static void main(String[] args)
	{
          byte b=50;//byte range -128 to 127
           int i=b;//byte value can hold the integer (int is 32 bits & byte is 8 bits) this is implicit casting
           //here byte is converting into int
           
   System.out.println("the value of byte is "+ b);
   System.out.println("the value of int is "+ i);
	}

}
