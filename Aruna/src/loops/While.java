package loops;
//first  condition will be checked

/*if the condition is TRUE then all the loop stmts will be executed .When ever the ctrl reaches end of the loop 
automatically it will be transfer to condition part again until condition becomes FALSE.*/

/*  if the condition is False all the loop stmts will be skippped and rest of the program will be executed.*/
 
// in WHILE and DO WHILE  the initialization;condition checking;increment(or)decrement all three has to be placed in three different places
// whereas FOR loop all three has to be place in single line.adv : to decrease the length of program
public class While {

	public static void main(String[] args) 
	{
		int number=1;//initialization
		System.out.println("print the number: ");
		while(number<5)//1<5  true    //condition
		{
			System.out.println(number);//print 1 in console
			number++;       // increment                 //now number 2  it automatically transfer to condition part again until 5<5 it means condition failed
		}
	}

}
