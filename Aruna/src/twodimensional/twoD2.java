package twodimensional;

public class twoD2 {

	public static void main(String[] args)
	{
		int[][] a={{1,2,3,4,5},{6,7,8,9,10}}; 
		int[][] table=new int[2][5];
		

				for(int i=0;i<table.length;i++)//row for loop
				{
					for(int j=0;j<table[i].length;j++)//col for loop
					{
						System.out.print(a[i][j]+"\t");

					}
					System.out.println();
				}



	}

}
