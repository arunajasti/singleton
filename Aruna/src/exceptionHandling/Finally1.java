package exceptionHandling;

public class Finally1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;

		try{
			int c=a/b;
			System.out.println(c);
		}
		finally{
			System.out.println("Succefully excecuted");
		}
	}

}
