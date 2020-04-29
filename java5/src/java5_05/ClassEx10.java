package java5_05;

import java.util.Scanner;

class Ex10{
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;

}
public class ClassEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
Ex10 e =new Ex10();
		System.out.println("=== 롯데리아 ===");
for(int i=0;i<e.arMenu.length;i++){
	System.out.println("["+(i+1)+"]"+e.arMenu[i]+" : "+e.arPrice[i]);
}
		
		int select = 0;
		for(int i=0;i<5;i++){
			System.out.print("메뉴 주문: ");
			select = scan.nextInt();
			e.arCount[select-1]++;
		}
		e.total = e.arPrice[0]*e.arCount[0]+e.arPrice[1]*e.arCount[1]+e.arPrice[2]*e.arCount[2];
		System.out.println("총 금액  = "+e.total);
		System.out.print("현금 입력: ");
		int cash = scan.nextInt();
		if(cash<e.total){
			System.out.print("현금이 부족합니다");
		}else{
			System.out.println("=== 롯데리아 영수증 ===");
			for(int i=0;i<e.arMenu.length;i++){
				System.out.println("["+(i+1)+"]"+e.arMenu[i]+" : "+e.arCount[i]);
			}
			System.out.println("4. 총 금액: "+e.total+"원");
			System.out.println("5. 잔돈: "+(cash-e.total)+"원");
				
		}
	}

}
