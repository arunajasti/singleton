package loops;

public class ForLoop3 {

	public static void main(String[] args)
	{
		int[] number=new int[3];//here just create an array .not initialise values
		String[] names={"aruna","sandhya","sunitha"};
		
		System.out.println("Enter the number");
		
		for(int i=0;i<number.length;i++)//i=0;i<3;i++
		{
			number[i]=Integer.parseInt(args[i]);// we pass arguments in runtime
			System.out.println(number[i]);
			
			
		}
		
		System.out.println("Given Names");
		for(String s:names)//enchance for loop
		{
			System.out.println(s);
		}
	}

}
