package wrapper;

public class Wrapper3 {

	public static void main(String[] args) 
	{
		//Integer i=new Integer(10);
		//Integer i=Integer.valueOf(10);
		Integer i=10;//autoBoxing  10 => Integer.valueOf(10) 
		 int k=i;//unboxing converting object into primitive
         i=i+10;
        

         System.out.println("The value is " +i);//i=10+10
        System.out.println("The value is " +k);//k=i  k=10
         
	}

}
