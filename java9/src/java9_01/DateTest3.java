package java9_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("�� :" + (date.getYear() + 1900));
		System.out.println("�� :" + (date.getMonth() + 1));
		System.out.println("�� :" + (date.getDate()));

		System.out.println("���� :" + (date.getDay()));

		System.out.println("�� :" + (date.getHours()));
		System.out.println("�� :" + (date.getMinutes()));
		System.out.println("�� :" + (date.getSeconds()));

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("�� : " + calendar.get(Calendar.YEAR));
		System.out.println("�� : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("�� : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� : " + calendar.get(Calendar.DATE));

		System.out.println("���� : " + calendar.get(Calendar.DAY_OF_WEEK));

		System.out.println("�� : " + calendar.get(Calendar.HOUR)); // 12�ð�
		System.out.println("�� : " + calendar.get(Calendar.HOUR_OF_DAY)); // 24�ð�
		System.out.println("�� : " + calendar.get(Calendar.MINUTE));
		System.out.println("�� : " + calendar.get(Calendar.SECOND));
		System.out.println("1/1000�� : " + calendar.get(Calendar.MILLISECOND));

	}

}
