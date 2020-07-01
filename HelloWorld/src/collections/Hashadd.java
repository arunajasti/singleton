package collections;

import java.util.HashSet;

public class Hashadd {

	public static void main(String[] args)
	{
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(100);
		hash.add(101);
		hash.add(102);
		hash.add(103);
		hash.add(101);
		hash.add(102);
		System.out.println(hash);//print all values in one line
		int sum=0;
		for(Integer i:hash)//for each loop
		{
			sum=sum+i;
			System.out.println(i);//print all integer values one by one
			
		}
		System.out.println("the sum of HashSet is "+sum);//print the sum of hashset values
	}

}
