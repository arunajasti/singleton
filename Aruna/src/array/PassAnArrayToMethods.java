package array;
//here program is pass an array to methods
// here using method
public class PassAnArrayToMethods

{
	public static void main(String[] args) 
	{
		int[] numbers={5,2,67,9,45};		//create an array in main method
		ascending(numbers);//ascending method call
         descending(numbers);//descending method call
		/*ascdesc sort=new ascdesc();//if methods are not static we can create the object for that class
		sort.ascending(numbers);*///call the methods by using object reference variable
         
         //ascdesc.ascending(numbers);//classname.methodname(numbers).methods are static so we can cal directly by using classname
	}

	public  static void ascending(int[] order)
	{

		//int temp;
		System.out.println("Before ascending");
		for(int i=0;i<order.length;i++)
		{
			System.out.println(order[i]);

		}
		int temp=order[0];
		for(int i=0;i<order.length;i++)
		{
			for(int j=i+1;j<order.length;j++)
			{
				if(order[i]>order[j])
				{
					temp=order[i];		
					order[i]=order[j];
					order[j]=temp;
				}
			}
		}
		System.out.println("ascending order");
		for(int i=0;i<order.length;i++)
		{
			System.out.println(order[i]);
		}
	}

	public static void descending(int[] numbers)
	{
		System.out.println("Before descending");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);

		}
		int temp=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					temp=numbers[i];		
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("Descending  order");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

}


