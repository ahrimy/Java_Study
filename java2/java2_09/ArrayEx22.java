package java2_09;
import java.util.Scanner;
public class ArrayEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[1]�߰�");
			System.out.println("[2]����");
			System.out.println("[3]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if (cnt >= 5) {
					System.out.println("���̻� �߰� �� �� ����.");
				} else {
					System.out.print("�߰��� �� �Է� : ");
					int data = scan.nextInt();
					arr[cnt++] = data;
				}
				
			}
			else if(sel == 2) {
				int check = 0;
				if (cnt == 0) {
					System.out.println("������ �� ����");
					run = false;
				} else {
					System.out.print("������ �� �Է� : ");
					int data = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (data == arr[i]) {
							for (int j = i; j < cnt; j++) {
								if (j + 1 == cnt) {
									arr[j] = 0;
								} else {
									arr[j] = arr[j + 1];
								}
							}
							check = 1;
							cnt--;
						}
					}
					if(check==0){
						System.out.println("�������� �ʴ� ��");
					}

				}
				
			}
			else if(sel == 3) {
				
				if (cnt >= 5) {
					System.out.println("���̻� �߰� �� �� ����.");
				} else {
					System.out.print("������ ��ġ �Է� : ");
					int idx = scan.nextInt();
					if (idx <= cnt && idx >= 0) {
						System.out.print("������ �� �Է� : ");
						int data = scan.nextInt();
						for (int i = cnt; i > idx; i--) {
							arr[i] = arr[i - 1];
						}
						arr[idx] = data;
						cnt++;
					}else{
						System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
						continue;


					}
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}

	}

}
