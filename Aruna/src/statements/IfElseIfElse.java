package statements;
//If..ElseIF...Else
public class IfElseIfElse {

	public static void main(String[] args) 
	{
		int score=85;
		char grade;
		
		if(score>=80||score<=90)
		{
			grade='A';
			System.out.println("Score is between 80 and 90 is "+"Grade: "+grade);
		}else if(score<=70 && score>=60)
		{  
			grade='B';	
		}else if(score>=50)
		{
			grade='C';
		}
		else
			grade='D';
		System.out.println("GRADE: " + grade);
	}

	

}
