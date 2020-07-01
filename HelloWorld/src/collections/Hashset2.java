package collections;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args)
	{
		//here specific datatype is integer
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(101);
		hash.add(102);
		hash.add(103);
		hash.add(104);
		hash.add(203);
		hash.add(209);
		hash.add(null);
		System.out.println(hash);
		for(Integer i:hash)
		{

			System.out.println(i);//print all integer values one by one

		}

	}

}
