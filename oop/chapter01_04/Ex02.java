package chapter01_04;
/*
 * 기본생성자는 본래 자동생성되지만, 
 * 개발자가 다른 생성자를 추가로 만들었을 시, 그 역할을 하지 않는다.
 * 때문에 클래스 설계시 무조건 기본 생성자를 만들고 시작하자.
 */
class Fruit{
	String name;
	int price;
	
	//기본 생성자 : ()소괄호가 비어있는 생성자를 의미함.
	Fruit(){
		System.out.println("생성자 호출");
		name = "오렌지";
		price = 500;
	}
	
	//생성자 오버로딩
	Fruit(String name, int price){
		this.name = name;
		this.price = price;		
	}
	void setData(String name, int price){
		this.name = name;
		this.price = price;
	}
	//@주석 : 어노테이션(annotation)
	//문법적 규칙을 검사하는 기능을 가진 주석
	
	@Override
	public String toString() {//메서드의 선언부
		return name+" : "+price; //메서드의 구현부
	}
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit orange = new Fruit();
		//orange.setData("오렌지", 1000);
		
		//방법1) 점을 통해 초기화
		orange.name = "오렌지";
		orange.price = 1000;
		
		//방법2) 메서드를 직접생성해 초기화
		orange.setData("오렌지", 1000);
		
		//방법3) 생성자 호출을 통해 초기화
		Fruit berry = new Fruit("딸기",300);
	

		System.out.println(orange);
		
		System.out.println(berry);
	}

}
