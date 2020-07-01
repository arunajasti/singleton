package collections;

//Treeset means the o/p will comes ascending order
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args)
	{
		
		TreeSet <Integer>link=new TreeSet<Integer>();
		link.add(202);
		link.add(102);
		link.add(103);
		link.add(104);
		link.add(203);
		link.add(209);
		//link.add(null; TreeSet doesn't allow the null values
		System.out.println(link);
	}

}
