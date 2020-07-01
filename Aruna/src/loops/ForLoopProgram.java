package loops;
import java.util.Scanner;
//Write a times table program. The program should ask a user to input a number (Scanner class use).This number is then used as the times table.
//So if the user enters 10, the 10 times table should be displayed. 
public class ForLoopProgram {
public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
 System.out.println("Enter Table Number: ");
   int table=scan.nextInt();//2
   int multiply=0;
   for(int i=1;i<11;i++)
   {
	   multiply=table*i;//
  
System.out.println(table +"x "+ i +"= "+ multiply);
   }
    scan.close();
    
	}

}
