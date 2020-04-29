package java2_03;

import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] seat = new int[7];

		boolean run = true;
		while (run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("[");
				for(int i=0;i<7;i++){
					System.out.print(seat[i]+" ");
				}
				System.out.println("]");
				System.out.print("좌석 선택 [0-6]: ");
				sel = scan.nextInt();
				if(seat[sel]==1){
					System.out.println("This seat is not available");
				}else if(seat[sel]==0){
					seat[sel]=1;
					System.out.println("Success");
				}
			} else if (sel == 2) {
				run = false;
			}
		}
		int sales = 0;
		for(int i=0;i<7;i++){
			if(seat[i]==1){
				sales+=12000;
			}
		}
		System.out.println("Sales : "+sales);

	}

}
