package collections;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args)
	{
		//if we specific datatype String so we can add only String Values
		HashSet<String> hash=new HashSet<String>();
		hash.add("Aruna");
		hash.add("Rama");
		hash.add("Latha");
		hash.add("Rikhil");
		hash.add("Latha");
		hash.add("Arjun");
		System.out.println(hash);
		//all Integers
		/*HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(100);
		hash.add(101);
		hash.add(102);
		hash.add(103);
		hash.add(101);
		hash.add(102);
		System.out.println(hash);*/
}
}


