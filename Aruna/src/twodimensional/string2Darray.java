package twodimensional;

public class string2Darray {

	public static void main(String[] args)
	{
		
			    String[][] cartoons = {
			        { "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },
			        { "Rubbles", "Barney", "Betty", "Bam Bam" },
			        { "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro" },
			        { "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne" } };

			    for (int i = 0; i < cartoons.length; i++) {
			      System.out.print(cartoons[i][0] + ": ");
			      for (int j = 1; j < cartoons[i].length; j++) {
			        System.out.print(cartoons[i][j] + " ");
			      }
			      System.out.println();
			    }
			  }
			}

	
		/*String[][] firstname={{"rama","rikhil","arjun","aruna"},{"sam","chow","lucky","chinnu"}};
		//String[][] lastname={{"jasti","chowdary","lakshmi","bolla"},{"papa","bujji","bangaram","chittu"}};
		// String[][] fullname=new String[1][1];
		for(int i=0;i<firstname.length;i++)
		{
			for(int j=0;j<firstname[i].length;i++)
			{
				
				System.out.print(firstname[i][j] +"\t");
				
				
			}
			System.out.println();
		}
		
		
		

	}

}*/
