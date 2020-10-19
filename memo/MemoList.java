package memo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MemoList {

	private ArrayList<MemoVO> memoList = new ArrayList<>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}
	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}
	
	@Override
	public String toString() {
//		마지막에 입력된 글(최신글) 부터 출력하기 위해 ArrayList에 저장된 마지막 글 부터 출력한다.
		String str = "";
		for(int i=memoList.size()-1 ; i>=0 ; i--) {
			str += memoList.get(i) + "\n";
		}
		return str;
	}
	
//	MemoProject 클래스에서 ArrayList에 저장할 내용이 기억된 객체를 넘겨받아 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
//		글 저장 후 글 번호를 다시 부여하는 메소드를 실행한다.
		reNumber();
	}
	
//	글 번호를 다시 부여하는 메소드
	private void reNumber() {
		for(int i=0 ; i<memoList.size() ; i++) {
			memoList.get(i).setNo(i + 1);
		}
	}
	
//	ArrayList에 저장된 내용을 출력하는 메소드
	public void viewMemo() {
		if(memoList.size() != 0) {
			for(int i=memoList.size()-1 ; i>=0 ; i--) {
				System.out.println(memoList.get(i));
			}
		} else {
			System.out.println("저장된 메모가 없습니다.");
		}
	}
	
//	MemoProject 클래스에서 삭제할 글 번호를 넘겨받고 ArrayList에 저장된 삭제 또는 수정할 글 한 건을 리턴하는 메소드
	public MemoVO selectMemo(int no) {
		try {
			return memoList.get(no - 1);
		} catch(Exception e) {
			return null;
		}
	}
	
//	MemoProject 클래스에서 삭제할 글 번호를 넘겨받고 ArrayList에 저장된 글 한 건을 삭제하는 메소드
	public void deleteMemo(int no) {
		memoList.remove(no - 1);
//		글 삭제 후 글 번호를 다시 부여하는 메소드를 실행한다.
		reNumber();
	}
	
//	MemoProject 클래스에서 수정할 글 번호를 넘겨받고 ArrayList에 저장된 글 한 건을 수정하는 메소드
	public void updateMemo(int no, String memo) {
		memoList.get(no - 1).setMemo(memo);
	}
	
//	MemoProject 클래스에서 텍스트 파일의 이름을 넘겨받고 ArrayList에 저장된 글 전체를 텍스트 파일에 저장하는 메소드
	public void fileWriteMemo(String fileName) {
		PrintWriter pw = null;
		try {

			String path = String.format("./src/memo/%s.txt", fileName);
//			System.out.println(path);
			pw = new PrintWriter(path);
			

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			for(MemoVO vo : memoList) {
				/*
				String str = "";
				str += vo.getNo() + " ";
				str += vo.getName() + " ";
				str += vo.getPassword() + " ";
//				replace(a, b) : 문자열의 모든 a를 b로 치환한다.
				str += vo.getMemo().replace(" ", "_") + " ";
				str += sdf.format(vo.getWriteDate());
				*/
				String str = String.format("%s %s %s %s %s", vo.getNo(), vo.getName(), 
						vo.getPassword(), vo.getMemo().replace(" ", "_"),
						sdf.format(vo.getWriteDate()));
				System.out.println(str);
				pw.write(str + "\r\n");
			}
		} catch(Exception e) {
			System.out.println("파일이 없습니다.");
		} finally {
			if(pw != null) { pw.close(); }
		}
	}
	
//	MemoProject 클래스에서 텍스트 파일의 이름을 넘겨받고 텍스트 파일의 내용을 ArrayList에 저장하는 메소드
	public void fileReadMemo(String fileName) {
		Scanner sc = null;
		
		try {
			String path = "./src/memo/" + fileName + ".txt";
			sc = new Scanner(new File(path));
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine().trim();		// 텍스트 파일의 내용을 한 줄 읽는다.
//				System.out.println(str);
//				텍스트 파일에서 읽은 한 줄에서 공백을 구분자로 사용해서 읽어들이는 스캐너를 만든다.
				Scanner scan = new Scanner(str);
				while(scan.hasNext()) {
					
//					텍스트 파일의 내용을 읽어 각각 변수에 저장한다.
					int no = scan.nextInt();
					String name = scan.next();
					String password = scan.next();
					String memo = scan.next();
					String writeDate = scan.next();
					
					MemoVO vo = new MemoVO(no, name, password, memo, writeDate);
					memoList.add(vo);
				}
			}
			
			System.out.println("파일에서 읽기완료!!!");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} finally {
			if(sc != null) { sc.close(); }
		}
		
	}
	
}

