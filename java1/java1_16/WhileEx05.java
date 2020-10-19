package java1_16;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] price = {8700,6200,1500};
		int[] order = {0,0,0};
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price[0] + "원");
		System.out.println("2.새우    버거 : " + price[1] + "원");
		System.out.println("3.콜         라 : " + price[2] + "원");
		int total=0;
		int select = 0;
		for(int i=0;i<5;i++){
			System.out.print("메뉴 주문: ");
			select = scan.nextInt();
			order[select-1]++;
		}
		total = price[0]*order[0]+price[1]*order[1]+price[2]*order[2];
		System.out.println("총 금액  = "+total);
		System.out.print("현금 입력: ");
		int cash = scan.nextInt();
		if(cash<total){
			System.out.print("현금이 부족합니다");
		}else{
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거: "+order[0]+"개");
			System.out.println("2. 새우 버거: "+order[1]+"개");
			System.out.println("3. 콜라: "+order[2]+"개");
			System.out.println("4. 총 금액: "+total+"원");
			System.out.println("5. 잔돈: "+(cash-total)+"원");
				
		}
	}

}
