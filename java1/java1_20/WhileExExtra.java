package java1_20;

import java.util.Scanner;

public class WhileExExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int HP = 100;
		int power = 5;
		System.out.println("Welcom");
		System.out.print("Ser you nickname(only number):");
		int name = scan.nextInt();

		System.out.println("Hi, " + name);
		System.out.println("==���� ����==");
		System.out.println("[��������] �������� ����, ����, ������ �ֽ��ϴ�.");
		System.out.println("{����}������ ü���� ȸ���� �� �ֽ��ϴ�.");
		System.out.println("{����}������ ���⸦ ��ȭ�Ͻ� �� �ֽ��ϴ�.");
		System.out.println("{����}������ ���͸� ��Ƽ� ���� �� �� �ֽ��ϴ�.");
		System.out.println("[����] ���� {����}���� ����ϸ� ������ ����ǰ� �����Ͱ� ������ϴ�.");
		System.out.println(" ");
		System.out.println("���� ����");
		
		int start = 0;
		int place = 0;
		int place2 = 0;
		int money = 200;
		int power2 = 1;
		
		while(start==0){
			System.out.print("where do you want to go?(1.���� 2.���� 3.����):");
			place = scan.nextInt();
			if(place ==1){
				if(place2==1){
					System.out.println("�̹� ������ �ֽ��ϴ�.");
				}else{
					System.out.println("������ �̵��մϴ�.");
					place2 = 1;
					int a=0;
					while(a==0){
						System.out.println("���� ����.������?");
						System.out.print("1.ü��ȸ�� 2.�ٸ������� �̵�");
						int select = scan.nextInt();
						if(select==1){
							if(HP==100){
								System.out.println("�̹� ü�� ������.");
							}else{
								HP=100;
								System.out.println("ȸ���Ϸ�");
							}
						}else if(select==2){
							a=1;
						}
					}
				}
			}else if(place==2){
				if(place2==2){
					System.out.println("�̹� ������ �ֽ��ϴ�.");
				}else{
					int e=0;
					while(e==0){
						place2 = 2;
						System.out.println("��������.������?");
						System.out.print("1.���Ⱝȭ 2.�ٸ������� �̵�");
						int select = scan.nextInt();
						if(select==1){
							if(power2*50>money){
								System.out.println("�� ����. �������� ���� ���ؿ�����");
							}else{
								money = money-power2*50;
								power += 10;
								power2 += 1;
								System.out.println("Power:"+power);
								System.out.println("Money:"+money);
							}
						}else if(select==2){
							e=1;
						}
					}
				}
			}else{
				if(place2==3){
					System.out.println("�̹� ������ �ֽ��ϴ�.");
				}else{
					int t=0;
					while(t==0){
						int enemyHP=100;
						place=3;
						System.out.println("��������.������?");
						System.out.print("1.������� 2.�ٸ������� �̵�");
						int select = scan.nextInt();
						if(select==1){
							while(enemyHP>0){
								enemyHP = enemyHP-power;
							}
							System.out.println("���� ����. +50����. -10HP");
							HP = HP-10;
							money += 50;
							System.out.println("Money:"+money+" HP:"+HP);
							if(HP<=0){
								System.out.println("HP����, ��������");
								t=1;
								start=1;
							}
							
						}else{
							t=1;
						}
					}
				}
			}
		}

	}

}
