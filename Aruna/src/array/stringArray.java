package array;

public class stringArray {

	public static void main(String[] args) 
	{
		String[] firstname={"aruna","sunitha","sandhya","rikhil","arjun"};
		String[] lastname={"jasti","dantu","bolla","chowdary","lakshmi"};
		String[] fullname=new String[5];//new keyword used for an array size
		for(int i=0;i<fullname.length;i++)
		{
			fullname[i]=firstname[i] +" "+ lastname[i];
			System.out.println("print names : "+fullname[i]);
		}
		

	}

}
