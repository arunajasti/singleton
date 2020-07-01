package finalKeyword;

public class BlankFinalVariable1 {
	private final int speedlimit;
	

	public BlankFinalVariable1() 
	{
		
		speedlimit=100;
		System.out.println("Constructor speedlimit=" + speedlimit);
	}
	public int getSpeedlimit() 
	{
		return speedlimit;
	}


	
	public static void main(String[] args)
	{
		BlankFinalVariable1 bin=new BlankFinalVariable1();
		
		int finalspeedlimit=bin.getSpeedlimit();
		System.out.println("SpeedLimit is =" + finalspeedlimit);
		

	}


	

}
