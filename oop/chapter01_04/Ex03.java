package chapter01_04;

class Super{
	Super(){
		System.out.println("�θ� ������ ȣ��");
	}
	int x;
	Super(int X){
		x=100;
	}
}
//��Ӱ��赵 : (Ŭ���� ���� ��) ctrl +t
class Sub extends Super{
	Sub(){ //�θ�Ŭ�������� �⺻�����ڰ� ���ǵǾ����� ������ super()�� ����
		//super();//�׻� �����Ǿ�����
		System.out.println("�ڼ� ������ ȣ��");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
	}

}
