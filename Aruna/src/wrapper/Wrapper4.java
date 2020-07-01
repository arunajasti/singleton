package wrapper;

public class Wrapper4 {
 Integer x;
	 
	public void get(int k)
	{
	x=k; //convert primitive into object
	}
	public  int put()
	{
		return  x;
	}

	public static void main(String[] args)
	{
	Integer i=10;
		
	Wrapper4 wr=new Wrapper4();
	                 
	wr.get(i);//calling the method with parameters
	int result=wr.put();
	
	System.out.println("i value is "+ result);

	}

}
