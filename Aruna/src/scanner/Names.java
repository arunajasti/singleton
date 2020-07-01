package scanner;

import java.util.Scanner;

public class Names {

	public static void main(String[] args) 
	{
		String[] name=new String[5];//string array
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the names");
		//scan.nextLine();//in output the cursor comes nextline
		for(int i=0;i<5;i++)
		{
			name[i]=scan.next();//if the array is string use next()
			
		}
		System.out.println("given names");
		for(int i=0;i<5;i++)
			System.out.println(name[i]);
scan.close();
	}

}
