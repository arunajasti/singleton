package exceptionUnChecked;

public class Arithmatic {

	public static void main(String[] args)
	{
		int arr[]={5,3,2,0};
		int x=arr[2]/arr[3]; //2/0;  //Exception is raised at runtime so user can handle these exceptions by using try and catch block
		System.out.println(" the value of x is: " + x);

	}

}
