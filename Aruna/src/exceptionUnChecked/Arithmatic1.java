package exceptionUnChecked;

public class Arithmatic1 {

	public static void main(String[] args) {
		int arr[]={5,3,2,0};
		
		try{
		int x=arr[2]/arr[3]; //2/0; //i got error here
		System.out.println(" the value of x is: " + x);
		}
		//Exception is a super class of all Exceptions
		catch(Exception e)//e is a reference variable of Exception //thos catch stmt catches all exceptions
		{
			System.out.println(e);//e is print what kind of exception
		}
		


	}

}
