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
		System.out.println("==게임 설명==");
		System.out.println("[던전게임] 내에서는 마을, 상점, 던전이 있습니다.");
		System.out.println("{마을}에서는 체력을 회복할 수 있습니다.");
		System.out.println("{상점}에서는 무기를 강화하실 수 있습니다.");
		System.out.println("{던전}에서는 몬스터를 잡아서 돈을 벌 수 있습니다.");
		System.out.println("[주의] 만약 {던전}에서 사망하면 게임이 종료되고 데이터가 사라집니다.");
		System.out.println(" ");
		System.out.println("게임 시작");
		
		int start = 0;
		int place = 0;
		int place2 = 0;
		int money = 200;
		int power2 = 1;
		
		while(start==0){
			System.out.print("where do you want to go?(1.마을 2.상점 3.던전):");
			place = scan.nextInt();
			if(place ==1){
				if(place2==1){
					System.out.println("이미 마을에 있습니다.");
				}else{
					System.out.println("마을로 이동합니다.");
					place2 = 1;
					int a=0;
					while(a==0){
						System.out.println("마을 도착.다음은?");
						System.out.print("1.체력회복 2.다른곳으로 이동");
						int select = scan.nextInt();
						if(select==1){
							if(HP==100){
								System.out.println("이미 체력 차있음.");
							}else{
								HP=100;
								System.out.println("회복완료");
							}
						}else if(select==2){
							a=1;
						}
					}
				}
			}else if(place==2){
				if(place2==2){
					System.out.println("이미 상점에 있습니다.");
				}else{
					int e=0;
					while(e==0){
						place2 = 2;
						System.out.println("상점도착.다음은?");
						System.out.print("1.무기강화 2.다른곳으로 이동");
						int select = scan.nextInt();
						if(select==1){
							if(power2*50>money){
								System.out.println("돈 부족. 던전에서 돈을 구해오세요");
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
					System.out.println("이미 던전에 있습니다.");
				}else{
					int t=0;
					while(t==0){
						int enemyHP=100;
						place=3;
						System.out.println("던전도착.다음은?");
						System.out.print("1.몬스터잡기 2.다른곳으로 이동");
						int select = scan.nextInt();
						if(select==1){
							while(enemyHP>0){
								enemyHP = enemyHP-power;
							}
							System.out.println("몬스터 잡음. +50코인. -10HP");
							HP = HP-10;
							money += 50;
							System.out.println("Money:"+money+" HP:"+HP);
							if(HP<=0){
								System.out.println("HP부족, 게임종료");
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
