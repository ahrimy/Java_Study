package chapter01_04;
/*
 * �⺻�����ڴ� ���� �ڵ�����������, 
 * �����ڰ� �ٸ� �����ڸ� �߰��� ������� ��, �� ������ ���� �ʴ´�.
 * ������ Ŭ���� ����� ������ �⺻ �����ڸ� ����� ��������.
 */
class Fruit{
	String name;
	int price;
	
	//�⺻ ������ : ()�Ұ�ȣ�� ����ִ� �����ڸ� �ǹ���.
	Fruit(){
		System.out.println("������ ȣ��");
		name = "������";
		price = 500;
	}
	
	//������ �����ε�
	Fruit(String name, int price){
		this.name = name;
		this.price = price;		
	}
	void setData(String name, int price){
		this.name = name;
		this.price = price;
	}
	//@�ּ� : ������̼�(annotation)
	//������ ��Ģ�� �˻��ϴ� ����� ���� �ּ�
	
	@Override
	public String toString() {//�޼����� �����
		return name+" : "+price; //�޼����� ������
	}
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit orange = new Fruit();
		//orange.setData("������", 1000);
		
		//���1) ���� ���� �ʱ�ȭ
		orange.name = "������";
		orange.price = 1000;
		
		//���2) �޼��带 ���������� �ʱ�ȭ
		orange.setData("������", 1000);
		
		//���3) ������ ȣ���� ���� �ʱ�ȭ
		Fruit berry = new Fruit("����",300);
	

		System.out.println(orange);
		
		System.out.println(berry);
	}

}
