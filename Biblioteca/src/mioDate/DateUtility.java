package mioDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	
	
	private static final int NUMERO_MILISECOND_PER_UN_GIORNO = 86400000;


	public static Date convertStringToDate(String  dataString) throws ParseException{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		;
		Date date = sdf.parse(dataString);
		
	    return date;
 		
		
		
		
	}
	
	// convert JavaDate To SqlDate
	
      public java.sql.Date convertJavaDateToSqlDate(java.util.Date date){
		
		
		return new java.sql.Date(date.getTime());
	}
      
     
  	// convert Calendar To java Date
      public Date convertCalendarToJavaDate(Calendar cal){
    	  
    	return  cal.getTime();
    
      }
      
     
      // confrontare  2 date usando java Util date  
      
      public long getDayDifference(Date date1 , Date date2){
    	  

  	     long diffMilliSecond=date2.getTime()-date1.getTime();
  	   
    	 long dayDiff = diffMilliSecond/NUMERO_MILISECOND_PER_UN_GIORNO; 
 		return dayDiff;
    	  
      }
      
  
      
      

}
