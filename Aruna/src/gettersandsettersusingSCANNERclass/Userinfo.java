package gettersandsettersusingSCANNERclass;

import java.util.Scanner;

public class Userinfo {

	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		              int temp =scan.nextInt();//i enter 2
		              int i=0;
		              while(i<temp)//0<2
		              {
		            	  User user=new User();
		              System.out.println("Enter User first name");
		              String fname=scan.next();
		              user.setFirstname(fname);
		              System.out.println("Enter last name");
		              String lname=scan.next();
		              user.setLastname(lname);
                            System.out.println(user);
                            i++;
		              }
		              scan.close();
	}

}
