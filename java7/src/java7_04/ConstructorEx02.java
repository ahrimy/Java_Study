package java7_04;
class BookA{
    
    String title;        // 책 제목
    String author;        // 책 저자
    int price;            // 책 가격
    
    // 기본 생성자
    BookA(){}
 
    // 생성자 오버로딩
    BookA(String title, int price){
        // this.title = title;
        // author = "작자미상";
        // this.price = price;
        
        // 생성자 호출
        this(title, "작자미상", price);
    }
    
    BookA(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void showInfo() {
        System.out.println(title + ":" + author + "(" + price + "원)");
    }
    
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookA b1 = new BookA("자바의 정석", "남궁성", 27000);
		b1.showInfo();
		
		BookA b2 = new BookA("춘향전", 9000);
		b2.showInfo();

	}

}
