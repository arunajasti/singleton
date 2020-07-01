package scanner;
//take the numbers randomly
import java.util.Scanner;

public class CumulativeScanner3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how many numbers add up");
		int addup=scan.nextInt();
		int sum=0;
		System.out.println("enter 3 numbers randomly");
		for(int i=0;i<=addup;i++)
		{
			
			sum=sum+scan.nextInt();//taking the 3 values by user
		}
		System.out.println("sum is:"+sum);


		scan.close();
	}

}
