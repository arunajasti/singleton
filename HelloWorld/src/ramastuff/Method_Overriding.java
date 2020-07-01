package ramastuff;

public class Method_Overriding {

	public static void main(String[] args) {

		    B  obj1 = new  B();
		        obj1.show ();
		        obj1.display();
		        
		    C  obj2 = new  C();
		        obj2.showc ();
		        
	}
}
	
class  A 
   {
	   public void show()
  		  {
	          System.out.println( "  Class A   show () "); 
	     	}
	   
	   public void display ()
		  {
	          System.out.println( "  Class A  display ()  "); 
	     	}

	} 
	
	 class  B  extends A 
	 {
		     public void show()
		       {
		            System.out.println( "  Class B   show () "); 
	         	}
    } 
		
	 class  C  extends A 
	 {
		     public void show()
		       {
		            System.out.println( "  Class C   show () "); 
	         	}
		     public void showc()
		       {
		            System.out.println( "  Class C   showC () "); 
	         	}
    } 
	