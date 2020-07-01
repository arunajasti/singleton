package loops;

public class DoWhile1 {

	public static void main(String[] args)
	{
		String[] flowers={"Lotus","Rose","Jasmine","Sunflower"};
		System.out.println("Print the Flower Names");
		
		int i=0;//i starts with 0 as array index starts with 0 too
		do
		{
			System.out.println(flowers[i]);
			i++;
		}while(i<4);

	}

}
