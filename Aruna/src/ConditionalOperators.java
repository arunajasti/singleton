//The conditional operators or logical operators (&& and ||) are used to perform  on two boolean expressions and result in a boolean value.
//They have �short-circuiting� behavior:
public class ConditionalOperators {

	public static void main(String[] args)
	{
		int a,b;
		a=5;
		b=11;
		boolean result;
		result=(a>10)&&(b>10);
		{
			System.out.println("a and b are greater than 10 : " +result);
		}
      result=(a>10)||(b>10);
      {
    	  System.out.println("either a and b are greater than 10 : " +result);
      }

	}

}