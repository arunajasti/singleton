package commandlinearguments;
//Here using Array
public class ArrayAdd2
{

	public static void main(String[] args)
	{
		   int a[]=new int[100];
		   System.out.println("print array length "+ a.length);//print the length of an array
			int sum=0;
			for(int i=0;i<args.length;i++)
			{
				//sum=sum+args[i]; we convert args[i]into interger because args[i] is stringname
				//convert string into INT is parseInt(stringname)
				 
				a[i]=Integer.parseInt(args[i]);
				sum=sum+a[i];
			}
				System.out.println("print the values "+ sum);
			

		}

}


