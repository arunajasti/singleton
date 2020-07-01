package array;

public class ArrayAscending {

	public static void main(String[] args) 
	{
		int num[]=new int[6];
		System.out.println("Print the array length: "+ num.length);//print  the array length
		int i;
		for( i=0;i<6;i++)
		{
			num[i]=Integer.parseInt(args[i]);
			System.out.println("array of elements: " + num[i]);
		}
		int temp=i;
		for(i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;

				}
			}
		}

		System.out.println("Ascending order is : ");
		for(i=0;i<6;i++)
			System.out.println(num[i]);

	}
}


