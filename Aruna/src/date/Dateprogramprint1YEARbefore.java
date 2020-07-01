package date;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Dateprogramprint1YEARbefore {
	
	public static void main(String[] args) 
	{
		//Date class to print the current date
		Date date=new Date();
		System.out.println("Todays date: "+ date);
		
		//format the date using simpledateformat class (mm-dd-yyyy)
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String str=sdf.format(date);
		System.out.println("Current date : "+ str);
		
		//Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time:
		 Calendar cal = Calendar.getInstance();   
		cal.add(Calendar.YEAR, -1);
		System.out.println("date before 1 year : " + (cal.get(Calendar.MONTH) + 1) + "-"
		        + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.YEAR));

		
		
		

	}

}
