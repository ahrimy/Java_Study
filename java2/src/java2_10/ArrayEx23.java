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


			System.out.println("1.����");
			System.out.println("2.Ż��");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("���� ���¹�ȣ �Է�: ");
			int check = 0;
				int input = scan.nextInt();
				for(int i=0;i<cnt;i++){
					if(input==accs[i]){
						System.out.println("�̹� �����ϴ� ��ȣ");
						check = 1;
						break;
					}
				}
				if(check==0){
					accs[cnt] = input;
					System.out.print("���� ��й�ȣ: ");
					input = scan.nextInt();
					pws[cnt] = input;
					cnt++;
				}
			} else if (sel == 2) {
				System.out.print("Ż���� ���¹�ȣ �Է�: ");
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
							System.out.println("���� �޷�");
							check = 1;
							cnt--;
							break;
						}
					}
					if(check==0){

						System.out.println("�������� �ʴ� ����");
	
					}
			}

		}

	}

}
