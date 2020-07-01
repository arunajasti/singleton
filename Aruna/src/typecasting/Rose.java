package typecasting;

 class Flower
 {
	public void smell()
	{
		System.out.println("any flower gives smell");
	}
 }
 class Rose extends Flower
 {
	 public void smell()
	 {
		 System.out.println("Rose flower give rosy smell");
	 }
 
	public static void main(String[] args) 
	{
		Flower f=new Flower();//superclass object is f
               f.smell();
	    Rose r=new Rose();//subclass object is r
	           r.smell();
	
	        f=r;//subclass to superclass it is valid. subclass object r is assigned (casted) to super class object f.so  f will call Rose smell() method.
	      f.smell();//prints the subclass Rose smell()
	      
	   /*  r=f;//cannot convert superclass to subclass it is invalid so we use explicit downcasting*/
	      
	      r=(Rose)f;//explictdowncasting 
	      //f returns the Rose reference to Rose itself. For this reason f.smell() prints the subclass Rose smell(). That is, r is calling its own smell(). 
	      
	      f.smell();
	      

	}
 }

