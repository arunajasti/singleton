package statements;
//Java provides decision making statements so as to control the flow of your program. These statements are:
//•if...then
//•if...then...else
//•switch..case

//If the boolean expression evaluates to true, then the IF block of code will be executed, otherwise ELSE block of code will be executed.
public class IfElse {

	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		if(x>10)//condition is nothing but boolean expression it represents true(or) false
		{
			System.out.println("print x value: "+x);
		}else
			System.out.println("print y value: "+y);

	}

}
