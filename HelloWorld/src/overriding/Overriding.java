/*Method overriding requires superclass and subclass
 * Method overloading is nothing but same method name and same parameter list
 */

package overriding;

class Arithematic  //superclass
{
	public void sum(int a,int b)
	{
		System.out.println("The sum  of super class is.."+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("The sub is.."+(a-b));
	}

}
class Multiply extends Arithematic        //subclass
{
	public void sum(int a,int b) //sum is overrridden method
	{
		System.out.println("The sum of sub class is.."+(a+b));
	}
	public void mul(int a,int b)
	{
		System.out.println("The mul is.."+(a*b));
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		//compiler will get confused that which sum method call
		//we should create the object of subclass not superclass
		//i.e, compiler will take overridden method of subclass not superclass
		
         Multiply multiple = new Multiply();
         multiple.sum(10, 20);// sum method call subclass
         multiple.sub(20, 10);
         multiple.sum(100, 20);// sum method call subclass
         multiple.mul(2, 5);
	}

}
