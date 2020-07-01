package commandlinearguments;

public class ConvertStringintoInt {

	public static void main(String[] args)
	{

String number1="24";
String number2="12";
//Convert primitive values to String and vice-versa.
//All wrapper classes provide utility methods to convert String values to primitives and vice-versa. 


int value1=Integer.parseInt( number1 );//convert string into integer put that value into value1
int value2=Integer.parseInt(number2);
int sum=value1+value2 ;

System.out.println("Add the String : "+sum);




	}

}
