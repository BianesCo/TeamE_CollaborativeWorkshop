package interfaces;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			validateDate();
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"----- ERROR -----");
		}
		
	}

	private static void validateDate() {
		// TODO Auto-generated method stub
		try {
			String data = JOptionPane.showInputDialog("Enter date in dd/mm/aaaa format ");
			JOptionPane.showMessageDialog(null, dates(data));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"----- ERROR -----");
		}
		

	}
	public static String dates(String data) {
		String[] datas = data.split("/");
		String dat1 = datas[0];
		String dat2 = datas[1];
		String dat3 = datas[2];
		
		int day = Integer.parseInt(dat1);
		int month = Integer.parseInt(dat2);
		int year = Integer.parseInt(dat3);
		String monthName=null;
		
		if (month<=12 && month>=1) {
			Locale locale = new Locale("es","ES");
		    Calendar calendarInicio = Calendar.getInstance();
		    calendarInicio.set(Calendar.MONTH, month-1);
		    monthName=calendarInicio.getDisplayName(Calendar.MONTH, Calendar.LONG, locale);
		}else {
			return "null";
		}
		if (year >=1100) {
			year=year;
		}else {
			year=0;
			return "null";
		}
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day<=31 && day>=1) {
				day = day;
			}else {
				return "null";
			}
			break;
		case 4: case 6: case 9: case 11:
			if (day<=30 && day >=1) {
				day = day;
			}else {
				return "null";
			}
		case 2:
			Date yearPre = new Date();
			 if(leapYear(1900 + yearPre.getYear())){
			    if(day<=29 && day >=1) {
			    	day=day;
			    }else {
			    	return "null";
				}
			  
			 }else {
                 if(day<=28 && day >=1) {
                	 day = day;
                 }else {
                	 return "null";
				}
			 }
             break;
		} 
	
		return day+ " de " +monthName+ " del " +year;
	}
	
	public static boolean leapYear(int year) {
		 GregorianCalendar calendar = new GregorianCalendar();
		    boolean leapYear = false;
		    if (calendar.isLeapYear(year)) {
		        leapYear = true;
		    }
		    return leapYear;
	}


	}

