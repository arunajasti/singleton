package commandlinearguments;
// need to create an array with 100 numbers (1-100) and then calculate
//Here i'm not using Array
public class ArrayAdd {

	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)//i=0 means 0 is index
		{
			//sum=sum+args[i]; we convert args[i]into interger because args[i] is stringname
			//convert string into INT is parseInt(stringname)
			sum=sum+Integer.parseInt(args[i]);
		}
			System.out.println("print the values "+ sum);
		}

}
//ArrayFor & ArrayFor2 both will come same output