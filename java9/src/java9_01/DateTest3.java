package java9_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("년 :" + (date.getYear() + 1900));
		System.out.println("월 :" + (date.getMonth() + 1));
		System.out.println("일 :" + (date.getDate()));

		System.out.println("요일 :" + (date.getDay()));

		System.out.println("시 :" + (date.getHours()));
		System.out.println("분 :" + (date.getMinutes()));
		System.out.println("초 :" + (date.getSeconds()));

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("년 : " + calendar.get(Calendar.YEAR));
		System.out.println("월 : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("일 : " + calendar.get(Calendar.DATE));

		System.out.println("요일 : " + calendar.get(Calendar.DAY_OF_WEEK));

		System.out.println("시 : " + calendar.get(Calendar.HOUR)); // 12시각
		System.out.println("시 : " + calendar.get(Calendar.HOUR_OF_DAY)); // 24시각
		System.out.println("분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("초 : " + calendar.get(Calendar.SECOND));
		System.out.println("1/1000초 : " + calendar.get(Calendar.MILLISECOND));

	}

}
