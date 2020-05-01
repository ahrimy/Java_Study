package java7_01;

import java.util.Scanner;

public class ClassArray06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] list = new Student[3];
		int count = 0;

		while (true) {
			System.out.println("[1]학생 추가하기");
			System.out.println("[2]과목 추가하기");
			System.out.println("[3]성적 추가하기");
			System.out.println("[0]종료하기");

			int choice = scan.nextInt();

			if (choice == 1) {
				if (count < 3) {
					list[count] = new Student();
					System.out.print("이름을 입력하세요:");
					list[count].name = scan.next();
					System.out.print("수강과목 개수:");
					int temp = scan.nextInt();
					list[count].subjects = new Subject[temp];
					count++;
				} else {
					System.out.println("더이상 추가할 수 없습니다.");
				}
			} else if (choice == 2) {
				System.out.print("이름을 입력하세요");
				String temp = scan.next();
				for (int i = 0; i < 3; i++) {
					if (temp.equals(list[i].name)) {
						for (int j = 0; j < list[i].subjects.length; j++) {
							list[i].subjects[j] = new Subject();
							System.out.print("과목명을 입력하세요:");
							list[i].subjects[j].name = scan.next();
						}
					}
				}
			} else if (choice == 3) {
				System.out.print("이름을 입력하세요");
				String name = scan.next();
				System.out.print("과목명을 입력하세요:");
				String subject = scan.next();
				for (int i = 0; i < 3; i++) {
					if (name.equals(list[i].name)) {
						for (int j = 0; j < list[i].subjects.length; j++) {
							if (subject.equals(list[i].subjects[j].name)) {
								System.out.print("점수를 입력하세요:");
								list[i].subjects[j].score = scan.nextInt();
							}
						}
					}
				}
			} else if (choice == 0) {
				for (int i = 0; i < 3; i++) {
					System.out.println(list[i].name);
					for (int j = 0; j < list[i].subjects.length; j++) {
						System.out.print(list[i].subjects[j].name + " : " + list[i].subjects[j].score+" ");
					}

					System.out.println();
				}
				break;

			}
		}

	}

}
