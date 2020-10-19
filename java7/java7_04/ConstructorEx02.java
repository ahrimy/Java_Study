package java7_04;
class BookA{
    
    String title;        // å ����
    String author;        // å ����
    int price;            // å ����
    
    // �⺻ ������
    BookA(){}
 
    // ������ �����ε�
    BookA(String title, int price){
        // this.title = title;
        // author = "���ڹ̻�";
        // this.price = price;
        
        // ������ ȣ��
        this(title, "���ڹ̻�", price);
    }
    
    BookA(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void showInfo() {
        System.out.println(title + ":" + author + "(" + price + "��)");
    }
    
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookA b1 = new BookA("�ڹ��� ����", "���ü�", 27000);
		b1.showInfo();
		
		BookA b2 = new BookA("������", 9000);
		b2.showInfo();

	}

}
