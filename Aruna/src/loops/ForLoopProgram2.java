package loops;
//Use a for loop to print out the odd numbers from 1 to 10. 
//(For the easy way to do this exercise, think about the increment value of the loop, which is the third item between the round brackets.)

import java.util.Scanner;

public class ForLoopProgram2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  Number: ");
		int number=scan.nextInt();

		if(number%2==1)
		{
			System.out.println(number + " Odd number ");
		}else
			System.out.println(number +" Even number  ");

	
	scan.close();
}
}


