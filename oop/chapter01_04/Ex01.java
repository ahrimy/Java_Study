package chapter01_04;

import java.util.Calendar;

// �̱���(singleton) ����

class School {
	// 1. private ������
	private School() {}
	// 2. ��ü������ �޸𸮸� �����Ѵ�.
	private static School instance = new School();
	// 3. 2������ ������ �޸𸮸� return ���ִ� public �޼��带 �ۼ��Ѵ�.
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
		// DateŬ����(������) vs Calendar(�Ź���)
		Calendar cal = Calendar.getInstance();
	}
}









