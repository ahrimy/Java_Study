package chapter01_04;

import java.util.Calendar;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date();
//		date.getDate();			//deprecated(더 이상 사용 X)
		
		Calendar cal =  Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = MyCalendar.getHangulYoil(dayOfWeek);
				System.out.println(year+"년"+month+"월"+day+"일"+strDayOfWeek);
	}

}
