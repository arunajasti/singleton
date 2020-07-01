package loops;
//do...while loop is guaranteed to execute at least one time even if condition false
public class DoWhile {

	public static void main(String[] args) 
	{
		int i=5;    //initialization
		System.out.println("Print the values");
		do
		{
			
			System.out.println(i);
			i++;    //increment
		}while(i<5);    //condition   //here condition failed ( 5<5) but it executes one time because we checked the condition at end of the loop. 

	}

}
