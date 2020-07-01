package collections;

import java.util.HashSet;

public class Hashcopy {

	public static void main(String[] args)
	{
		
		HashSet<String> hash=new HashSet<String>();
		hash.add("Aruna");
		hash.add("Rama");
		hash.add("Latha");
		hash.add("Rikhil");
		hash.add("Latha");//duplicate value
		hash.add("Arjun");
		System.out.println("before addAll  "+hash);
		//create another Hashset
		HashSet<String> hash2=new HashSet<String>();
		hash2.add("Lakshmi");
		hash2.add("Chowdary");
		hash2.add("Rama");//duplicate value
		
		
		//copying one set to another
		hash.addAll(hash2);
		System.out.println("after addAll  "+hash);//print all hash & hash2 elements but not one by one
		//System.out.println("after addAll  "+hash2);//print hash2 elements
		System.out.println("print all  elements ");
		for(String names:hash)
		{
			System.out.println("name  "+names);
		}
	}

}
