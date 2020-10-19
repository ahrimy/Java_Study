package chapter01_03;
/*
 * #변수의 종류
 * 1.자료형 (data type)에 따른 분휴
 * 1) 기본형 변수(primitive type)
 * .정수형 : byte(1), short(2), int(4), long(8)
 * .실수형 : float(4), double(8)
 * .문자형 : char(2)
 * .논리형 : boolean(1)
 * 2) 참조형 변수(reference type)
 * 
 * 2.선언 위치에 따른 분류
 * 1)클래스 영역
 * 클래스 영역에 선언하는 변수는 선언과 동시에 값이 자동 초기화된다.
 * 정수(0), 실수(0.0), 클래스(null)
 * 	(1)static 변수 (=클래스 변수)
 * 		클래스명.변수명
 * 	(2)non-static 변수 (=인스턴스 변수)
 * 		클래스명 인스턴스 = new 클래스명()
 * 		인스턴스명.변수명
 * 
 * 2)메서드 영역
 * 	*지역변수는 값이 자동초기화되지 않는다.
 *   선언과 동시에 초기화해줄 것을 권장한다. 
 */
public class Ex03 {
	static int x;//클래스 변수
	int y;//인스턴스 변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Ex03.x);
				//instance (객체)
		Ex03 e = new Ex03();
		System.out.println(e.y);
		System.out.println(new Ex03().y);
		int num = 10;
		//자동 형 변환
		double d = num;
		//double d = (double)num;
		
		System.out.println(num);
		System.out.println(d);
		
		double a = 3.14;
		//자동 형 변환 X
		//강제 형 변환
		int x = (int)a;
		System.out.println(x);
	}

}
