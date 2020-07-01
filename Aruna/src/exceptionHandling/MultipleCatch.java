package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args)
{
int a[]={5,3,2};//array size is 2 starts with zero
		
		try{
			a[4]=10;
		System.out.println(a[4]);
		}
		catch(ArithmeticException e)//e is a reference variable of Exception 
		{
			System.out.println(e);//e is print what kind of exception
		}
		catch(ArrayIndexOutOfBoundsException e){
	        System.out.println(e);
	     }
		catch(Exception e){
	        System.out.println(" some other exception");
	     }



	}

}
