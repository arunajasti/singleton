package twodimensional;

public class twoD3 {

	public static void main(String[] args) 
	{
		int[][] a={{1,2,3,4,5},{6,7,8,9,10}}; 
		
		int rows=2;
			int cols=5;

				for(int i=0;i<rows;i++)//row for loop
				{
					for(int j=0;j<cols;j++)//col for loop
					{
						System.out.print(a[i][j]+"\t");

					}
					System.out.println();
				}
	}

}
