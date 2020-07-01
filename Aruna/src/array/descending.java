package array;

public class descending {

	public static void main(String[] args) 
	{
		int[] order={27,31,01,63,45,14,9};
            
		int temp=0;

		for(int i=0;i<order.length;i++)
		{
			System.out.println("Values before sorting: "  +order[i]);

			for(int j=i+1;j<order.length;j++)
			{
				if(order[i]<order[j])  //swapping the values using temp variable
				{

					temp=order[i];   //temp=32
					order[i]=order[j];  //order[i]=6
					order[j]=temp;      //order[j]=32

				}
			}
		}
		System.out.println("Decreasing Order:");
		for(int i=0;i<order.length;i++)
			System.out.println(""+order[i]); 


	}

}
