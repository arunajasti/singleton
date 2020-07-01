package array;

public class arraysort {

	public static void main(String[] args)
	{
		int[] order={2,1,7,10,6,3};
		System.out.println("before Ascending values:");
		for(int p:order) //this for loop is to print the values before ascending.this is enhanced for loop
		{
			System.out.println(p);
		}
		 int temp=order[0];//temp=0;
		
		for(int i=0;i<order.length;i++)
		{
			for(int j=i+1;j<order.length;j++)
			{
				if(order[i]>order[j])  //swapping the values using temp variable
				{
					temp=order[i];   //temp=32
					order[i]=order[j];  //order[i]=6
					order[j]=temp;      //order[j]=32
					
				}
				

			}
		}
		System.out.println("Increasing Order:");
	      for(int i=0;i<order.length;i++)
	           System.out.println(""+order[i]); 

		}

	}


