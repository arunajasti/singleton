package twodimensional;

public class twodArrayOwn {

	public static void main(String[] args) 
	{
		String[][] name={{"aruna","latha", },{"sandhya","rani",},{"rikhil","chowdary",}};//rows=3;cols=2
		System.out.println("length of the Array: " +name.length);//print length of the array
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[i].length;j++)
			{
				System.out.print(name[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
