package loops;


import java.util.Scanner;

public class MultiplicationProgram {

	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Table Number: ");
		
		int multiply=0;

if(scan.hasNextInt())//it checks next line has Integer or not
{

	int table=scan.nextInt();
			for(int i=1;i<11;i++)
			{
				multiply=i*table;

				System.out.println(table +"x "+ i +"= "+ multiply);
				
			}
		
	
}else
{
	System.out.println("not a real integer");
}


		scan.close();

	}
}

