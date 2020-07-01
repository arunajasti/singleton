package array;
//Here using sort
import  java.util.Arrays;
import java.util.Collections;
public class ascending {

	public static void main(String[] args) 
	{
		//int[] ascen={20,10,5,02};
         String[] ascen={"sandhya","aruna","arjun"};
		Arrays.sort(ascen);
		/*System.out.println("Ascending order:");
		 *for(int i=0;i<ascen.length;i++)
		{
			System.out.println( ascen[i]);
			}*/
		System.out.println("Ascending order");
		for(String s:ascen)
		{
			System.out.println(s);
		}
		Arrays.sort(ascen,Collections.reverseOrder());//collections.reverseorder use only string array for descending order
		System.out.println("descending order");
		for(String s:ascen)
		{
			System.out.println(s);
		}
	}
	
}