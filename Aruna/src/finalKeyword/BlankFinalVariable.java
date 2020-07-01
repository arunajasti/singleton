package finalKeyword;

public class BlankFinalVariable 
{
private final int speedlimit;//Here i'm not initialized the final value

	public BlankFinalVariable(int speedlimit)//Constructor
	{
	
	this.speedlimit = speedlimit;
}
	public int getSpeedlimit() 
	{
		return speedlimit;
	}

	public static void main(String[] args) 
	{

BlankFinalVariable blank=new BlankFinalVariable(100);
int speed=blank.getSpeedlimit();
System.out.println("Blank variable :"+speed);

	}


	
}
