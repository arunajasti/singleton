package day.three;

public class Biggestnumber {

	public static void main(String[] args)
	{

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		if(a>b && a>c)
		{
		System.out.println("a is the biggest number  is.. "+a);	
		}
		else 
			if(b>c && b>a)
		{
			System.out.println("b is the biggest number  is.. "+b);	
		}
			else 
				if(c>a && c>b)
				{
					System.out.println("c is the biggest number  is.. "+c);	
				}
				else
					if(a==b) 
					{
						System.out.println("a and b are biggest number " +(a=b) );	
					
					}
					else
						if(b==c)
						{
							System.out.println("b and c are biggest number " +(b=c) );
						}
                    else
                    	if(c==a)
						{
							System.out.println("c and a are biggest number " +(c=a) );
						}
                    	else
					System.out.println(" The biggest number is not found.. ");					
		}
	
	}
