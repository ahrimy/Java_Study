package java6_07;

import java.util.Scanner;

class Theater {
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// 영화관 이름
	int cnt = 0;					// 예매 수
	int money = 0;					// 매출액

	void showMenu(){
		System.out.println("=메가 영화관=");
		System.out.println("1.좌석예매");
		System.out.println("2.종료");
	}
	void showSeat(){
		System.out.print("[");
		for(int i=0;i<7;i++){
			System.out.print(seat[i]+" ");
		}
		System.out.println("]");
	}
	void choiceSeat(){
		System.out.print("좌석 선택 [0-6]: ");
		int sel = scan.nextInt();
		if(seat[sel]==1){
			System.out.println("This seat is not available");
		}else if(seat[sel]==0){
			seat[sel]=1;
			System.out.println("Success");
		}
	}
	void showSales(){
		money = 0;
		cnt=0;
		for(int i=0;i<7;i++){
			if(seat[i]==1){
				money+=12000;
				cnt++;
			}
		}
		System.out.println("Ticket: "+cnt+" Sales : "+money);
	}
	void run(){
		while (true) {
			showMenu();
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				showSeat();
				choiceSeat();
			} else if (sel == 2) {
				break;
			}
		}
		showSales();
	}
}
public class MethodEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater megabox = new Theater();
		megabox.name = "메가박스";
		
		megabox.run();

	}

}
