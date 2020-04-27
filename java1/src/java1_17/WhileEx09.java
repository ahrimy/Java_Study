package java1_17;
import java.util.Scanner;
public class WhileEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(run) {			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int money=0;
			int acc=0;
			if(sel == 1) {
				System.out.print("Amount:");
				money = scan.nextInt();
				myMoney += money;
				System.out.println("Deposit Success, "+myMoney);
			}
			else if(sel == 2) {
				System.out.print("Amount:");
				money = scan.nextInt();
				if(myMoney>=money){
					myMoney -= money;
					System.out.println("Withdraw Success, "+myMoney);
				}else{
					System.out.println("Balance is not enough");
				}
			}
			else if(sel == 3) {
				System.out.print("Enter the account number:");
				acc = scan.nextInt();
				if(acc==yourAcc){
					System.out.print("Enter the amount:");
					money = scan.nextInt();
					if(myMoney>=money){
						myMoney -= money;
						yourMoney += money;
						System.out.println("Transfer Success, my balance:"+myMoney+" your balance:"+yourMoney);
					}else{
						System.out.println("Balance is not enough");
					}
				}else{
					System.out.println("Account number is invalid");
				}
			}
			else if(sel == 4) {
				System.out.println("myMoney:"+myMoney);
				System.out.println("yourMoney:"+yourMoney);
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
