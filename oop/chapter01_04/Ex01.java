package chapter01_04;

import java.util.Calendar;

// 싱글턴(singleton) 패턴

class School {
	// 1. private 생성자
	private School() {}
	// 2. 자체적으로 메모리를 생성한다.
	private static School instance = new School();
	// 3. 2번에서 생성한 메모리를 return 해주는 public 메서드를 작성한다.
	public static School getInstance() {
		return instance;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		School s1 = School.getInstance();
		School s2 = School.getInstance();
		School s3 = School.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// deprecated
		// Date클래스(구버전) vs Calendar(신버전)
		Calendar cal = Calendar.getInstance();
	}
}









