package java2_10;

import java.util.Scanner;

public class ArrayEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;

		boolean run = true;
		while (run) {
			for(int i=0; i<cnt; i++) {
				System.out.println((i+1) + "." + accs[i] + ":" + pws[i]);
			}
			System.out.println();


			System.out.println("1.가입");
			System.out.println("2.탈퇴");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("가입 계좌번호 입력: ");
			int check = 0;
				int input = scan.nextInt();
				for(int i=0;i<cnt;i++){
					if(input==accs[i]){
						System.out.println("이미 존재하는 번호");
						check = 1;
						break;
					}
				}
				if(check==0){
					accs[cnt] = input;
					System.out.print("가입 비밀번호: ");
					input = scan.nextInt();
					pws[cnt] = input;
					cnt++;
				}
			} else if (sel == 2) {
				System.out.print("탈퇴할 계좌번호 입력: ");
				int check = 0;
					int input = scan.nextInt();
					for(int i=0;i<cnt;i++){
						if(input==accs[i]){
							for(int j=i;j<cnt;j++){
								if(j+1==cnt){
									accs[j]=0;
									pws[j] = 0;
								}else{
									accs[j] = accs[j+1];
									pws[j] = pws[j+1];
								}
							}
							System.out.println("삭제 왼료");
							check = 1;
							cnt--;
							break;
						}
					}
					if(check==0){

						System.out.println("존재하지 않는 계좌");
	
					}
			}

		}

	}

}
