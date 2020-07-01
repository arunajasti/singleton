package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		//ArrayList declaration with String datatype
		ArrayList<String>array=new ArrayList<String>();

		array.add("Sandhya");
		array.add("Aruna");
		array.add("Arjun");
		array.add("Rikhil");
		array.add("Rama");
		array.add("Sandhya");

		System.out.println("Print the names"+array);
		Iterator iterator=array.iterator();
		//we can use for each loop (or) Iterator
		System.out.println("Print the Elements one by one");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());// print the names one by one
		}
		Collections.sort(array);
		System.out.println("Sorting the names  "+array);

		System.out.println("Print the Elements one by one");
		for(String s:array)
		{
			System.out.println(s);//to print the elements one by one
		}
		
		
	}
}
