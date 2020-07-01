package exception;


//Throw is a User defined Exception
//Throw is used to Explicitly to throw an exception
class Lessbalance extends Exception//Exception is a superclass of all Exception LessBalance is My own Exceptionclass
{
	/*String message;
	public Lessbalance(String message)
	{
		this.message=message;
	}
	public String tostring()
	{
		return message;
	}*/ //or
	public String toString()
	{
		return "Insufficent Amount";
}
}
class Bank
{
	private String Name;
	private int Balance;
	public void read(String Name,int Balance)
	{
		
		try

		{
			if(Balance<500)
			{
				throw new Lessbalance();
			}
			else
			{
				this.Name=Name;
				this.Balance=Balance;
			}
		}
		catch (Lessbalance e)
		{
			System.out.println("error="+e);
			
			
		}
	}
		  public void show()
		{
			System.out.println("Name:"+Name);
			System.out.println("Balance:"+Balance);
		}
	

}


public class Throw 
{
public static void main(String[] args) 
	{
Bank b1=new Bank();
b1.read("Rama", 1000);
System.out.println("object1 values...");
b1.show();
Bank b2=new Bank();
b2.read("Aruna",400);
System.out.println("object2 values...");
b2.show();
	}

}
