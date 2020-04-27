package java1_09;

import java.util.Scanner;

public class IfEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		int[] price = {8700,6200,1500};
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price[0] + "원");
		System.out.println("2.새우    버거 : " + price[1] + "원");
		System.out.println("3.콜         라 : " + price[2] + "원");
		
		System.out.print("메뉴 주문: ");
		int order = scan.nextInt();
		System.out.print("현금: ");
		int cash = scan.nextInt();
		if(cash<price[order-1]){
			System.out.print("현금이 부족합니다");
		}else{
			System.out.println("=== 영수증 ===");
			System.out.println("주문 금액: "+price[order-1]+ "원");
			System.out.println("받은 현금: " + cash + "원");
			System.out.println("거스름돈: " + (cash-price[order-1]) + "원");
				
		}
		
	}

}
