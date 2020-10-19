package chapter01_04;

import java.util.Calendar;

public class MyCalendar {
	
	/**
	 * Calendar 클래스의 정수형 요일값을 전달해주면,
	 * 한국어 요일로 리턴해주는 메서드 입니다.
	 * @author ahirm
	 * @param dayOfWeek
	 * @return strDayOfWeek
	 */

	static String getHangulYoil(int dayOfWeek){
		String strDayOfWeek = "";
		switch(dayOfWeek){
		case Calendar.SUNDAY: strDayOfWeek = "일요일"; break;
		case Calendar.MONDAY: strDayOfWeek = "월요일"; break;
		case Calendar.TUESDAY: strDayOfWeek = "화요일"; break;
		case Calendar.WEDNESDAY: strDayOfWeek = "수요일"; break;
		case Calendar.THURSDAY: strDayOfWeek = "목요일"; break;
		case Calendar.FRIDAY: strDayOfWeek = "금요일"; break;
		case Calendar.SATURDAY: strDayOfWeek = "토요일"; break;
		}
		return strDayOfWeek;

	}
	static String getHangulYoil(Calendar cal){
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = "";
		switch(dayOfWeek){
		case Calendar.SUNDAY: strDayOfWeek = "일요일"; break;
		case Calendar.MONDAY: strDayOfWeek = "월요일"; break;
		case Calendar.TUESDAY: strDayOfWeek = "화요일"; break;
		case Calendar.WEDNESDAY: strDayOfWeek = "수요일"; break;
		case Calendar.THURSDAY: strDayOfWeek = "목요일"; break;
		case Calendar.FRIDAY: strDayOfWeek = "금요일"; break;
		case Calendar.SATURDAY: strDayOfWeek = "토요일"; break;
		}
		return strDayOfWeek;

	}

}
