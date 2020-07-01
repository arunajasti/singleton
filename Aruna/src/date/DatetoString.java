package date;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DatetoString {

	public static void main(String[] args)
	{
       //Get the date today using Calendar object.
Date d = new Date();
		System.out.println("TODAY'S date: " + d);
		
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");//USE month UPPERCASE MM
	    //System.out.println(form.format(d));
	    String str = sdf.format(d); // or if you want to save it in String str
	    System.out.println(str); 
	}

}
