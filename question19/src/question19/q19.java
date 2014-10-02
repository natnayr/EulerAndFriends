package question19;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class q19 {

	public static void main(String[] args) {
		Calendar c1 = GregorianCalendar.getInstance();
		c1.clear();
		c1.set(1901, 00, 01);
		System.out.println(c1.getTime().toString());
		
		Calendar c2 = GregorianCalendar.getInstance();
		c2.clear();
		c2.set(2000, 11, 31);
		System.out.println(c2.getTime().toString());
		int sundays = 0;
		
		while(c1.getTime().compareTo(c2.getTime()) <= 0) {
			if(c1.get(Calendar.DAY_OF_WEEK) == 1){
				sundays++;
			}
			c1.add(Calendar.MONTH, 1);
		}
		
		System.out.println(sundays);
	}

}
