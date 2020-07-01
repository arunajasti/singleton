package loops;

public class While1 {

	public static void main(String[] args)
	{
	int[] numbers={2,3,4,5};
	
	int i=0;//i starts with 0 as array index starts with 0 too
	
	
	System.out.println("using WHILE loop");
	System.out.println("values are: ");
	while(i<4)
	{
		
		System.out.println(numbers[i]);
		          i++;
	}
	
	System.out.println("using FOR loop");
	for(int k=0;k<4;k++)
	{
		System.out.println(numbers[k]);
	}
	}

}
