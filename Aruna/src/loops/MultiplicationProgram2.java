package loops;

import java.util.Scanner;

public class MultiplicationProgram2 {
public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter How many tables");
		int temp=scan.nextInt();//2 tables
		int i=0;
		
		while(i<temp)//0< 2 // 1<2 //2<2 while condition is false it breaks the loop
		{
			System.out.println("enter table number");//5 table // 6 table
			int table=scan.nextInt();
			int multiply=0;
			for(int j=0;j<11;j++)
			{
				multiply=j*table;
				System.out.println(table +"x "+ j +"= "+ multiply);
			}
			
			i++;//1 then it goes to while loop // i=2 it goes to while loop
		}
		scan.close();
		

	}

}
