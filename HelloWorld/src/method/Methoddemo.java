package method;

import java.util.Scanner;

class Methoddemo {

	
		public static int sum(int a,int b)//int sum(int n1,int n2)
		{	
			int c=a+b;//int n3=n1+n2;
			return c;//return n3; it goes sum(a,b) and put return value in int add
		}

		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=scanner.nextInt();
			System.out.println("Enter another number");
			int b=scanner.nextInt();
			int add=sum(a,b); //calling with parameters
			System.out.println("The sum is..:"+add);
			scanner.close();
		}
	}


