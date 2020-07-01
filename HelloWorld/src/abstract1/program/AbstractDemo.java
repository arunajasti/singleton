package abstract1.program;

import java.util.Scanner;

abstract class Cellphone
{
	abstract public long call(long num); //Abstract method
	public void volume()               // concrete method
	{
		System.out.println("Volume increase");
	}
	

}
class Airtelsim extends Cellphone
{
	public long call(long number)                                    
    { 
		long num1=number;
		return num1;
		
	}
}
class Idea extends Cellphone
{

	public long call(long num2) {
		System.out.println("idea call");
		
		return num2 ;
	}
	}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        long num=scan.nextLong();
        //assign super class reference to subclass object
      /*Cellphone cell=new Airtelsim();// method overriding dispatch(runtime polymorphism)
      cell.call(num);//call subclass overridden method
      cell.volume();//super class non overridden method*/
        Airtelsim air=new Airtelsim();
        air.call(num);
        air.volume();
        
       
        System.out.println("Enter a number");
        long num2=scan.nextLong();
        Idea idea=new Idea();
        idea.call(num2);
        idea.volume();
        scan.close();
        
	}

}
