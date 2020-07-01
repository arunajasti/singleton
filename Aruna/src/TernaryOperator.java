//Conditional operator is also known as the ternary operator. 
//This operator consists of three operands and is used to evaluate Boolean expressions.(result=A?B:C)
//variable x = (expression) ? value if true : value if false
//result=A?B:C
//if A (expression)is A evaluates to true, then evaluates B and assign its value to the result. Otherwise, if A evaluates to false, then evaluates C and assign its value to
//the result. 
public class TernaryOperator {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int result=(x>y)?x:y;//the expression evalutes false so we assign the y value to result
		System.out.println("the value of result is "+result);

		 result=(x<y)?x:y;////the expression evalutes true so we assign the x value to result
		System.out.println("the value of result is "+result);
	}

}
