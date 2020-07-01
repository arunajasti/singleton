package finalKeyword;

public class FinalVariable 
{
	private final int speedlimit=90;//Final Variable

	public void run()
	{
		//speedlimit=100;

	}
	public void run(final int speed)//Final parameter
	{
		//we cannot assign speed value to speedlimit because speedlimit is final
		//speedlimit=speed;//complie time error because we cannot change the Speedlimit value
        //speed=speed+100;//we cannot change the speed value

	}
	public static void main(String[] args)
	{
		FinalVariable fin=new FinalVariable();
		fin.run(90);
		System.out.println("Final Variable: "+ fin.speedlimit);
	}

}
