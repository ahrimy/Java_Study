package java07_02;

import java.util.Scanner;

class Ticket {
	boolean check;

	void showData() {
		if (check == true) {
			System.out.print("�� ");
		} else {
			System.out.print("�� ");
		}
	}
}

public class ClassArray09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Ticket[] tickets = new Ticket[8];
		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket(); // ���ϸ��� �Ǽ�.
		}
		
		while(true){
			System.out.println("[1]�ڸ�����");
			System.out.println("[2]����");
			int sel = scan.nextInt();
			
			if(sel==1){
				for(int i=0;i<8;i++){
					tickets[i].showData();
				}
				System.out.println();
				System.out.print("[0-7]�ڸ�����:");
				int choice = scan.nextInt();
				if(tickets[choice].check==true){
					System.out.println("������ �� ���� �ڸ�");
				}else if(tickets[choice].check==false){
					tickets[choice].check = true;
				}
			}else if(sel==2){
				for(int i=0;i<8;i++){
					tickets[i].showData();
				}
				break;
			}
		}

	}

}
