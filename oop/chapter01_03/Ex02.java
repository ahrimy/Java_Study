package chapter01_03;

/*
 * #접근제어자(=접근지정자)
 * public > protected > default > private
 * .public : 프로젝트 전체에서 사용 가능
 * .protected : 같은 패키지/다른 패키지에 있더라도 자식 클래스의 경우 접근 가능
 * .default : (접근 지정자 생략) 같은 패키지 내에서만 사용가능
 * .private : 클래스 내의 멤버들에게만 접근이 허용
 * 
 * #은닉화 (=캡슐화)
 * 변수에는 private을 붙여 데이터를 숨기고,
 * public 메서드를 통해 값의 유효성 검사를 거친
 * 안정한 데이터만 저장한다. 
 */

class Student{
	private int score;
	//get과 set메서드 자동완성 단축키
	//alt + shift + s,r
	
	//정규식 : 특수문자나 알파벳등을 검색해주는 기술(언어)
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hgd =  new Student();
		
	}

}
