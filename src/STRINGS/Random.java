package STRINGS;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Random {

	public static void main(String[] args) {
		
		
Calendar cal=Calendar.getInstance();
SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");

System.out.println(sd.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		
		

	}

public static void gitcode()
{
	System.out.println("things are great");
	System.out.println("things are good");
}
	
	
	
	
}
