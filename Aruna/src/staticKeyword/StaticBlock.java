package staticKeyword;

public class StaticBlock 
{
	static int data;
	public StaticBlock(int data)
	{
		StaticBlock.data=data;//this keyword(non-static) wont accept for static variables
		System.out.println("Constructor data : " + data);
	}

	static //static Block is executed first than main method
    {
		staticmethod();//static method called inside the static block
	    data=5;
	System.out.println("Static block is invoked");
	System.out.println("Static block data is: " + data);
	
	
	//System.exit(0);// exit the program here & not execute main method
	}
	static void staticmethod()
	{
		System.out.println("Static method invoked");
	}
	
	@Override
	public String toString() {
		return "data=" + data ;
	}

	public static void main(String[] args)
	{
		StaticBlock st=new StaticBlock(4);
		System.out.println(st);
	System.out.println("This is MAIN METHOD");


	}

}
