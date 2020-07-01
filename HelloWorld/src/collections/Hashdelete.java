package collections;

import java.util.HashSet;

public class Hashdelete {

	public static void main(String[] args)
	{
		//create hashset
		HashSet hash=new HashSet();
		//add the elements to hashset
		hash.add("Aruna");//string
		hash.add(100);//integer
		hash.add("Latha");
		hash.add(101);
		hash.add("Latha");
		hash.add('c');//char
		hash.add(99.5);//double
		hash.add(56.6f);//float
		hash.add(true);//boolean
		hash.add(null);//null value
		hash.add(null);
		System.out.println("Before Hashset values.."+hash);//display hashset elements
		//public void clear();// it removes all elements
		hash.clear();
		System.out.println("After Hashset values.."+hash);
		

	}

}
