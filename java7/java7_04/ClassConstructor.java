package java7_04;
class Fruit{
    String name;
    int price;
    
    // 기본생성자
    Fruit(){}        
 
    // 생성자 오버로딩(overloading)
    Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    void setData(String name, int price) {
        this.name = name;
        this.price = price;
    }
 
    void printData() {
        System.out.println(name + "(" + price + "원)");
    }
}

public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * # 생성자 메서드
         * 인스턴스 변수드를 초기화할 때 별도의 메서드를 만들지 않고,
         * 생성자 메서드를 제공한다.
         */
        Fruit apple = new Fruit();
        // .으로 접근해 멤버변수 초기화
        apple.name = "사과";
        apple.price = 1000;
        
        // 메서드를 만들어 멤버변수 초기화
        apple.setData("사과", 1000);
        apple.printData();
        
        // 생성자를 활용해 멤버변수 초기화
        Fruit banana = new Fruit("바나나", 3700);
        banana.printData();

	}

}
