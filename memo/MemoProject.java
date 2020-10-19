package memo;

import java.util.Scanner;

public class MemoProject {
	

	static MemoList memoList = new MemoList();

	public static void main(String[] args) {
		
//		MemoVO vo = new MemoVO("홍길동", "1111", "1등 입니다.");
//		System.out.println(vo);
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 7) {
			do {
				System.out.println("==========================================================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.파일로저장  6.파일에서읽기  7.종료 ");
				System.out.println("==========================================================================");
				System.out.print("원하는 메뉴를 선택하세요 : ");
				menu = sc.nextInt();
			} while(menu < 1 || menu > 7);
			

			switch(menu) {
				case 1: insert(); break;
				case 2: select(); break;
				case 3: update(); break;
				case 4: delete(); break;
				case 5: fileWrite(); break;
				case 6: fileRead(); break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
	}

	private static void fileRead() {
		Scanner scan = new Scanner(System.in);

		System.out.print("읽어올 파일 이름을 입력하세요 : ");
		String fileName = scan.nextLine().trim();

		memoList.fileReadMemo(fileName);
	}

	private static void fileWrite() {
		Scanner scan = new Scanner(System.in);

		System.out.print("저장할 파일 이름을 입력하세요 : ");
		String fileName = scan.nextLine().trim();
		memoList.fileWriteMemo(fileName);
		System.out.println("파일로 쓰기완료!!!");
	}


	private static void update() {
		Scanner scan = new Scanner(System.in);

		System.out.print("수정할 글 번호를 입력하세요 : ");
		int no = scan.nextInt();
		MemoVO vo = memoList.selectMemo(no);
		if(vo != null) {
		
			System.out.println(vo);

			scan.nextLine();
			System.out.print("수정할 글의 비밀번호를 입력하세요 : ");
			String password = scan.nextLine().trim();
			System.out.print("수정할 글의 내용을 입력하세요 : ");
			String memo = scan.nextLine().trim();

			if(password.equals(vo.getPassword())) {
				
				
				memoList.updateMemo(no, memo);
				System.out.println(no + "번 글 수정완료!!!");
				
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		} else {
			System.out.println(no + "번 글이 존재하지 않습니다.");
		}
		
	}


	private static void delete() {
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 글 번호를 입력하세요 : ");
		int no = scan.nextInt();
		MemoVO vo = memoList.selectMemo(no);
		if(vo != null) {
			
			System.out.println(vo);

			scan.nextLine();
			System.out.print("삭제할 글의 비밀번호를 입력하세요 : ");
			String password = scan.nextLine().trim();
			
			if(password.equals(vo.getPassword())) {
				
				memoList.deleteMemo(no);
				System.out.println(no + "번 글 삭제완료!!!");
				
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		} else {
			System.out.println(no + "번 글이 존재하지 않습니다.");
		}
	}


	private static void select() {
		memoList.viewMemo();
	}


	private static void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름, 비밀번호, 메모를 입력하세요.");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("메모 : ");
		String memo = scan.nextLine();

		MemoVO vo = new MemoVO(name, password, memo);
		memoList.addMemo(vo);
		System.out.println("저장완료!!!");
	}
	
}


