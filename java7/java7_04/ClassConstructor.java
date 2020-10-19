package java7_04;
class Fruit{
    String name;
    int price;
    
    // �⺻������
    Fruit(){}        
 
    // ������ �����ε�(overloading)
    Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    void setData(String name, int price) {
        this.name = name;
        this.price = price;
    }
 
    void printData() {
        System.out.println(name + "(" + price + "��)");
    }
}

public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * # ������ �޼���
         * �ν��Ͻ� �����带 �ʱ�ȭ�� �� ������ �޼��带 ������ �ʰ�,
         * ������ �޼��带 �����Ѵ�.
         */
        Fruit apple = new Fruit();
        // .���� ������ ������� �ʱ�ȭ
        apple.name = "���";
        apple.price = 1000;
        
        // �޼��带 ����� ������� �ʱ�ȭ
        apple.setData("���", 1000);
        apple.printData();
        
        // �����ڸ� Ȱ���� ������� �ʱ�ȭ
        Fruit banana = new Fruit("�ٳ���", 3700);
        banana.printData();

	}

}
