package java6_09;

import java.util.Scanner;

class Bank {
	String name = "";

	String[] arAcc = { "1111", "2222", "3333", "4444", "5555" };
	String[] arPw = { "1234", "2345", "3456", "4567", "5678" };
	int[] arMoney = { 87000, 34000, 17500, 98000, 12500 };

	int count = 5;

	// 3333 로그인 중
	int loginCheck = 2;
	Scanner scan = new Scanner(System.in);
	int MAX = 5;

	void showMenu() {
		System.out.print("# 로그인 상태 : ");
		if (loginCheck == -1) {
			System.out.println("로그아웃");
		} else {
			System.out.println(arAcc[loginCheck] + "님, 로그인 중...");
		}

		System.out.println("=== " + name + " ===");
		System.out.println("1.회원가입");
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
		System.out.println("7.잔액조회");
		System.out.println("0.종료");
	}

	int checkAcc(String myAcc) {
		int check = -1;
		for (int i = 0; i < count; i++) {
			if (myAcc.equals(arAcc[i])) {
				check = i;
				break;
			}
		}
		return check;
	}

	int checkPw(int accCheck) {
		System.out.print("비밀번호를 입력하세요 : ");
		String myPw = scan.next();

		int pwCheck = -1;

		if (arPw[accCheck].equals(myPw)) {
			pwCheck = accCheck;
		}

		return pwCheck;

	}



	void delMember() {
		if (loginCheck == -1) {
			System.out.println("Haven't logged in");
		} else {
			System.out.println("Have deleted Account " + arAcc[loginCheck]);
			for (int j = loginCheck; j < count; j++) {
				if (j + 1 == count) {
					arAcc[j] = "";
					arPw[j] = "";
				} else {
					arAcc[j] = arAcc[j + 1];
					arPw[j] = arPw[j + 1];
				}
			}

			count--;
			loginCheck = -1;

		}
	}

	void joinMember() {
		if (count < MAX) {
			System.out.print("Enter a new Id: ");
			int check = -1;
			String input = scan.next();
			check = checkAcc(input);
			if (check == -1) {
				arAcc[count] = input;
				System.out.print("Enter a password: ");
				input = scan.next();
				arPw[count] = input;
				arMoney[count] = 1000;
				count++;
			}
		} else {
			System.out.println("Account storage is full");
		}
	}

	void login() {
		if (loginCheck == -1) {
			int check = -1;

			System.out.print("Enter an Id:");
			String input = scan.next();
			check = checkAcc(input);

			if (check == -1) {
				System.out.println("This Id does not exist");
			} else {
				loginCheck = checkPw(check);
				if (loginCheck == -1) {
					System.out.println("Password is not correct");
				} else {
					System.out.println(arAcc[loginCheck] + " Complete logging in");
				}
			}
		} else {
			System.out.println("Account " + arAcc[loginCheck] + "is logging in");
		}
	}

	void logOut() {
		if (loginCheck == -1) {
			System.out.println("Haven't logged in");
		} else {
			System.out.println("Account" + arAcc[loginCheck] + "Sucessfully logged out");
			loginCheck = -1;
		}
	}

	void income() {
		if (loginCheck == -1) {
			System.out.println("Haven't logged in");
		} else {
			System.out.print("Enter the amount of cash:");
			int input = scan.nextInt();
			arMoney[loginCheck] += input;
			System.out.println("[Result]Account" + arAcc[loginCheck] + "balance : " + arMoney[loginCheck]);
		}
	}

	void trans() {
		if (loginCheck == -1) {
			System.out.println("Haven't logged in");
		} else {
			int check = 0;
			System.out.print("Enter an Id to transfer:");
			String input = scan.next();
			check = checkAcc(input);

			if (check == -1) {
				System.out.println("This Id does not exist");
			} else {
				if (check == loginCheck) {
					System.out.println("You can't send to the same account");
				} else {
					System.out.print("How much are you transfering?:");
					int money = scan.nextInt();
					if (arMoney[loginCheck] >= money) {
						arMoney[loginCheck] -= money;
						arMoney[check] += money;
						System.out.println("[Sent]Account" + arAcc[loginCheck] + "balance : " + arMoney[loginCheck]);
						System.out.println("[Received]Account" + arAcc[check] + "balance : " + arMoney[check]);
					} else {
						System.out.println("Balance is not enough");
					}
				}

			}
		}

	}
	void balance(){
		if (loginCheck == -1) {
			System.out.println("Haven't logged in");
		} else {
			System.out.println("Account" + arAcc[loginCheck] + "balance : " + arMoney[loginCheck]);
		}
	}
	void run() {
		while(true){
			showMenu();
			int sel = scan.nextInt();
			if(sel==1){joinMember();}else if(sel==2){delMember();}
			else if(sel==3){login();}else if(sel==4){logOut();}
			else if(sel==5){income();}else if(sel==6){trans();}
			else if(sel==7){balance();}else if(sel==0){break;}
			
			
		}
	}
}

public class MethodEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank woori = new Bank();
		woori.name = "우리은행";

		woori.run();
	}

}
