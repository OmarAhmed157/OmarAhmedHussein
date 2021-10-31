package utils;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeValidator {
	
	public static boolean ValDate (String date) {
		// 2021-02-21T07:55:01.285713+02:00
		SimpleDateFormat formatter = new SimpleDateFormat(
				"YYYY-MM-dd'T'HH:mm:ss.SSS",Locale.US);
		//format.setTimeZone(TimeZone.getTimeZone("UTC"));
		//formatter.parse(();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss.SSSZ");
		try {
			formatter.parse(date);
			//	    	System.out.print("Valid "+Variable);
			return true;
		}
		catch(Exception e) {
			//	    	System.out.println("////// INVALID "+Variable+"////////");
			return false;
		}
	} 

	public static int Separate_date(String str) { 
		String input,input1,input2;
		input =  str.substring(0, 4) + str.substring(5) ;
		input1 =  input.substring(0, 6) + input.substring(7) ;
		input2 = input1.substring(0, 8);
		int out = Integer.parseInt(input2);
		//	               str.substring(0, 4) + str.substring(p + 1);  
		//	               str.substring(0, p) + str.substring(p + 1);  
		//	               str.substring(0, p) + str.substring(p + 1);  
		return out;
	}  

}
