
public class Forloopsumcommand {

	public static void main(String[] args)
	{

int[] a= new int[100];
int sum=0;
for(int i=0;i<args.length;i++)
		{
	 a[i]=Integer.parseInt(args[i]);
	sum=sum+a[i];
		}
System.out.println("the sum is "+sum);
	}

}
