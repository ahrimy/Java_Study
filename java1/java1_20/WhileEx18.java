package java1_20;
import java.util.Scanner;
import java.util.Random;
public class WhileEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// ������(destination)
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		// ���� ��ġ
		int x = 0;
		int y = 0;
		
		// ����(direction)
		int dir = 0;
		
		// �ӵ�
		int speed = 0;
		
		// ���
		int fee = 0;
		
		int move = 0;
		boolean run = true;
		while(run) {
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("���⼳��[��(1)��(2)��(3)��(4)]:");
				dir = scan.nextInt();
			}
			else if(sel == 2) {
				System.out.print("�ӵ�����[1,2,3]:");
				speed = scan.nextInt();
			}
			else if(sel == 3) {
				if(dir==1){
					x = x+speed;
				}else if(dir==2){
					x=x-speed;
				}else if(dir==3){
					y=y-speed;
				}else if(dir==4){
					y=y+speed;
				}
				move += speed;
			}
			if(desX==x&&desY==y){
				if(move%2==1){
					fee = 50;
				}else{
					fee=0;
				}
				fee = fee+ (move/2)*50; 
				
				System.out.println("������ ����");
				System.out.println("��� : "+fee);
				
				run=false;
			}
		}


	}

}
