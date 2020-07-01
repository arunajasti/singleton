
public class Forloopcommand {

	public static void main(String[] args) 
	
	{
    	int a[]= new int[50];
	
	for(int i=0;i<args.length;i++)
	{
		 a[i]=Integer.parseInt(args[i]);
		
			System.out.println(a[i]);
	}

	}

}
