//The unary operators require only one operand; ( a++(post increment),++a(pre increment),b--(post decrement),--b(pre decrement)
//they perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean(!). 
public class UnaryOperators {

	public static void main(String[] args)
	{
	int a,b;
	a=1;
	b=5;
    System.out.println("the value of a++ is " +(a++)); //1 increment later now a is 2
                              System.out.println(a);
                              
    System.out.println("the value of ++a is " +(++a));// 3 this pre increment
                               System.out.println(a);
                               
    System.out.println("the value of b-- is " +(b--)); //  5 decrement later now b is 4
                                System.out.println(b);
                                
    System.out.println("the value of --b is " +(--b));   //   3 this is predecrment 
                                  System.out.println(b);
                                  
                                  boolean success=false;//inverts a value of a boolean
                                  System.out.println(success );
                                  System.out.println(!success);
	}
	

}
