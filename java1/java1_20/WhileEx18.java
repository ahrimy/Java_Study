package java1_20;
import java.util.Scanner;
import java.util.Random;
public class WhileEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// 목적지(destination)
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		int move = 0;
		boolean run = true;
		while(run) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("방향설정[동(1)서(2)남(3)북(4)]:");
				dir = scan.nextInt();
			}
			else if(sel == 2) {
				System.out.print("속도설정[1,2,3]:");
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
				
				System.out.println("목적지 도착");
				System.out.println("요금 : "+fee);
				
				run=false;
			}
		}


	}

}
