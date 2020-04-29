package java5_03;

import java.util.Scanner;
class Ex07{
	int[] seat = new int[7];
	int money = 0;
}


public class ClassEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex07 e = new Ex07();

		boolean run = true;
		while (run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			;
			if (sel == 1) {
				System.out.print("[");
				for(int i=0;i<7;i++){
					System.out.print(e.seat[i]+" ");
				}
				System.out.println("]");
				System.out.print("좌석 선택 [0-6]: ");
				sel = scan.nextInt();
				if(e.seat[sel]==1){
					System.out.println("This seat is not available");
				}else if(e.seat[sel]==0){
					e.seat[sel]=1;
					System.out.println("Success");
				}
			} else if (sel == 2) {
				run = false;
			}
		}

		for(int i=0;i<7;i++){
			if(e.seat[i]==1){
				e.money+=12000;
			}
		}
		System.out.println("Sales : "+e.money);
	}

}
