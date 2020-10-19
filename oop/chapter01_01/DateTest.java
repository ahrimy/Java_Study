package chapter01_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf2.format(date));
	}

}
