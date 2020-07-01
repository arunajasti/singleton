package array;

public class smallestNumber
{

	public static void main(String[] args)
	{
		int[] number={20,10,5,02,89,100,55};
		int small;
		small=number[0];//small=20
		for(int i=1;i<number.length;i++)//i=1;1<3 then number[i] is number[1]=10:  10<20
		
		if(number[i]<small)
		{
		
			small=number[i];//small=10
		
		}	System.out.println("print small number:" + small);
			
		

	}

}
