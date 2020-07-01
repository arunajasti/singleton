package day.five;

		import java.util.Scanner;

		public class Armstrong {

			
			public static void main(String[] args)
			{
				int n,sum=0,rem;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the number..");
				n=sc.nextInt();
				int temp=n;
				while(temp!=0)
				{
		          rem=temp%10;
		          sum=sum+(rem*rem*rem);
		          temp=temp/10;
				}
				if(sum==n)
				{
					System.out.println("the number is armstrong");
				}
				else
					System.out.println("the number is not armstrong");
			}
			

		}

		