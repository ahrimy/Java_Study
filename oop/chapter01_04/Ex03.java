package chapter01_04;

class Super{
	Super(){
		System.out.println("부모 생성자 호출");
	}
	int x;
	Super(int X){
		x=100;
	}
}
//상속관계도 : (클래스 선택 후) ctrl +t
class Sub extends Super{
	Sub(){ //부모클래스에서 기본생성자가 정의되어있지 않으면 super()가 에러
		//super();//항상 생략되어있음
		System.out.println("자손 생성자 호출");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
	}

}
