package java3_07;

import java.util.Scanner;

public class ArrayEx36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] score = null;
		int count = 0;

		while (true) {
			for(int i=0;i<count;i++){
				System.out.print(score[i]+" ");
			}
			System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int[] temp = null;
			int input = 0;
			if (sel == 1) {
				System.out.print("추가할 값 입력:");
				input = scan.nextInt();
				temp = new int[count+1];
				for(int i=0;i<count;i++){
					temp[i] = score[i];
				}
				temp[count] = input;
				score = temp;
				count++;	
			} else if (sel == 2) {
				System.out.print("삭제할 번호(인덱스) 입력:");
				input = scan.nextInt();
				temp = new int[--count];
				for(int i=0;i<input;i++){
					temp[i] = score[i];
				}
				for(int i=input;i<count;i++){
					temp[i] = score[i+1];
				}
				score = temp;
			} else if (sel == 3) {
				System.out.print("삭제할 값 입력:");
				input = scan.nextInt();
				for(int i=0;i<count;i++){
					if(score[i]==input){
						input = i;
						break;
					}
				}
				temp = new int[--count];
				
				for(int i=0;i<input;i++){
					temp[i] = score[i];
				}
				for(int i=input;i<count;i++){
					temp[i] = score[i+1];
				}
				score = temp;
			} else if (sel == 4) {
				System.out.print("추가할 위치(인덱스),값 입력:");
				input = scan.nextInt();
				int value = scan.nextInt();
				temp = new int[count+1];
				for(int i=0;i<input;i++){
					temp[i] = score[i];	
				}
				temp[input] = value;
				for(int i=input;i<count;i++){
					temp[i+1] = score[i];	
				}
				
				score = temp;
				count++;
			} else if (sel == 0) {
				break;
			}
		}

	}

}
