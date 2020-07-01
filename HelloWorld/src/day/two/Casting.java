package day.two;

public class Casting {

	public static void main(String[] args) 
	{
		
	byte b=100;
	int i=b;//implicit casting
	
    System.out.println("the value of byte is "+b);
    System.out.println("the value of int is "+i);

    int i2=100;
   // byte b2=i2; it will get error because BYTE can't hold the INT value because int is 4 bytes. byte is 1
    
	byte b2=(byte)i2;//now int value change into byte type
	//explicit type casting
	System.out.println("the value of int is "+i2);
	System.out.println("the value of byte is "+b2);
	
	float f=3.6f;
	int i3=(int)f;//explicit type casting
	System.out.println("the value of float is "+f);
	System.out.println("the value of int is "+i3);
			
	}

}
