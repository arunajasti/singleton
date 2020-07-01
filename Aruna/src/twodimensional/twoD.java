package twodimensional;

public class twoD {
//here the values  print 2x2 matrix if we want print 2x5 matrix check twoD2.java & tw0D3.java program
	public static void main(String[] args)
	{
		int[][] a={{1,2,3,4,5},{6,7,8,9,10}}; 
		//int[][] a=new int[2][5];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");

			}
			System.out.println();
		}


	}

}
