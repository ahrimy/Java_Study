package chapter01_04;

import java.util.Calendar;

public class MyCalendar {
	
	/**
	 * Calendar Ŭ������ ������ ���ϰ��� �������ָ�,
	 * �ѱ��� ���Ϸ� �������ִ� �޼��� �Դϴ�.
	 * @author ahirm
	 * @param dayOfWeek
	 * @return strDayOfWeek
	 */

	static String getHangulYoil(int dayOfWeek){
		String strDayOfWeek = "";
		switch(dayOfWeek){
		case Calendar.SUNDAY: strDayOfWeek = "�Ͽ���"; break;
		case Calendar.MONDAY: strDayOfWeek = "������"; break;
		case Calendar.TUESDAY: strDayOfWeek = "ȭ����"; break;
		case Calendar.WEDNESDAY: strDayOfWeek = "������"; break;
		case Calendar.THURSDAY: strDayOfWeek = "�����"; break;
		case Calendar.FRIDAY: strDayOfWeek = "�ݿ���"; break;
		case Calendar.SATURDAY: strDayOfWeek = "�����"; break;
		}
		return strDayOfWeek;

	}
	static String getHangulYoil(Calendar cal){
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = "";
		switch(dayOfWeek){
		case Calendar.SUNDAY: strDayOfWeek = "�Ͽ���"; break;
		case Calendar.MONDAY: strDayOfWeek = "������"; break;
		case Calendar.TUESDAY: strDayOfWeek = "ȭ����"; break;
		case Calendar.WEDNESDAY: strDayOfWeek = "������"; break;
		case Calendar.THURSDAY: strDayOfWeek = "�����"; break;
		case Calendar.FRIDAY: strDayOfWeek = "�ݿ���"; break;
		case Calendar.SATURDAY: strDayOfWeek = "�����"; break;
		}
		return strDayOfWeek;

	}

}
