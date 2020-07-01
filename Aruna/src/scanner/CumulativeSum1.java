package scanner;
//cumulative sum1 & cumulative scnner2 both o/p are same
public class CumulativeSum1 {

	public static void main(String[] args) 
	{
		//with out using scanner
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Cumulative Sum is: " + sum);
	}

}
