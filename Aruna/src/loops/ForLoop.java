package loops;
//what is loop?
//A loop is nothing but a repetive structure 
//which is useful to re-execute some set of stmts agin and again as per our requirement.

//For loop: It executes a block of statements repeatedly until the specified condition returns false.
public class ForLoop 
{
	public static void main(String[] args) 
	{
		int sum=0;//always declare outside loop
		int avg;
		System.out.println("print the numbers 1 to 4: ");
		for(int  i=1;i<5;i++)//the loop terminate when i reaches 5
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Addition of all values: "+sum);

		System.out.println("Avg the numbers");
		avg=sum/2;
		System.out.println(avg);


	}
}
