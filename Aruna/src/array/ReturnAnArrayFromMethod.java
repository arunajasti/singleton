package array;

public class ReturnAnArrayFromMethod {

	public static void main(String[] args)
	{
		int a[]={3,4,5,6};
		array(a);// call the method

	}
	public static int[] array(int[] b)//method can return int[] array
	{
		System.out.println("print the  Array values");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		return b;//in methods if there is an primitive data type this statement is compulsory
		
	}

}
