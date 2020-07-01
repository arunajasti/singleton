package collections;
import java.util.HashSet;
//Hashset cannot allow duplicate values
//hashset the o/p will not come order it come randomly.
//this program we are adding integer,string values
//we can add values any datatype
//hashset allows null values
public class Hashset {

	public static void main(String[] args)
	{
		//create Hashset declaration
		HashSet hash=new HashSet();
		//add elemets to hashset
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
		
		System.out.println(hash);//display hashset elemets

	}
}

	