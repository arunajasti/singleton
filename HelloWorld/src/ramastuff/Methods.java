package ramastuff;
public class Methods {
	
	private void  add(String name)
	{
	 	System.out.println( " Method Overloading with SRTING arrugmants  ");
	 	System.out.println(name);
    }
	
	public void  add(long A, long B)
	{
	 	A=A+B;
		 System.out.println( " Method Overloading with 2 arrguments with LONG  ");
	 	System.out.println(A);
    }
	
	public void  add(int A, int B, int C )
	{
	    A=A+B+C;
		 System.out.println( " Method Overloading with 3 arrguments  ");
	     System.out.println(A);
	 }

	public void  add(int A, int B, int C ,	int D)
	{
	    	A=A+B+C+D;
	       System.out.println( " Method Overloading with 4 arrguments  ");
           System.out.println(A);
     }

		public static void main(String[] args) {

		Methods obj1 = new Methods();
		obj1.add("aaaaaaaa"); 
		obj1.add(2,2);
		 obj1.add(3, 3,3);
		 obj1.add(4,4,4,4);
		 
	 	}
	}
