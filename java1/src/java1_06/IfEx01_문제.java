package java1_06;

public class IfEx01_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true){
			System.out.println("����  o");
		}
		if(false){
			System.out.println("���� x");
		}
		
		int num = 8;
		System.out.println(num%2==0);
		System.out.println(num%2==1);
		
		if(num%2==0){
			System.out.println("¦��");
		}
		if(num%2==1){
			System.out.println("Ȧ��");
		}
		
		num = -10;
		if(num>0){
			System.out.println("���");
		}else if(num==0){
			System.out.println("0");
		}else if(num<0){
			System.out.println("����");
		}
		
		num = 12;
		if(num%4==0){
			System.out.println("4�ǹ���̴�.");
		}else{
			System.out.println("4�� ����� �ƴϴ�.");
		}
		
		int score = 87;
		if(score>=80){
			System.out.println("�հ��Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
	}

}
