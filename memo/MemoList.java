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
//		�������� �Էµ� ��(�ֽű�) ���� ����ϱ� ���� ArrayList�� ����� ������ �� ���� ����Ѵ�.
		String str = "";
		for(int i=memoList.size()-1 ; i>=0 ; i--) {
			str += memoList.get(i) + "\n";
		}
		return str;
	}
	
//	MemoProject Ŭ�������� ArrayList�� ������ ������ ���� ��ü�� �Ѱܹ޾� ArrayList�� �����ϴ� �޼ҵ�
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
//		�� ���� �� �� ��ȣ�� �ٽ� �ο��ϴ� �޼ҵ带 �����Ѵ�.
		reNumber();
	}
	
//	�� ��ȣ�� �ٽ� �ο��ϴ� �޼ҵ�
	private void reNumber() {
		for(int i=0 ; i<memoList.size() ; i++) {
			memoList.get(i).setNo(i + 1);
		}
	}
	
//	ArrayList�� ����� ������ ����ϴ� �޼ҵ�
	public void viewMemo() {
		if(memoList.size() != 0) {
			for(int i=memoList.size()-1 ; i>=0 ; i--) {
				System.out.println(memoList.get(i));
			}
		} else {
			System.out.println("����� �޸� �����ϴ�.");
		}
	}
	
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް� ArrayList�� ����� ���� �Ǵ� ������ �� �� ���� �����ϴ� �޼ҵ�
	public MemoVO selectMemo(int no) {
		try {
			return memoList.get(no - 1);
		} catch(Exception e) {
			return null;
		}
	}
	
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް� ArrayList�� ����� �� �� ���� �����ϴ� �޼ҵ�
	public void deleteMemo(int no) {
		memoList.remove(no - 1);
//		�� ���� �� �� ��ȣ�� �ٽ� �ο��ϴ� �޼ҵ带 �����Ѵ�.
		reNumber();
	}
	
//	MemoProject Ŭ�������� ������ �� ��ȣ�� �Ѱܹް� ArrayList�� ����� �� �� ���� �����ϴ� �޼ҵ�
	public void updateMemo(int no, String memo) {
		memoList.get(no - 1).setMemo(memo);
	}
	
//	MemoProject Ŭ�������� �ؽ�Ʈ ������ �̸��� �Ѱܹް� ArrayList�� ����� �� ��ü�� �ؽ�Ʈ ���Ͽ� �����ϴ� �޼ҵ�
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
//				replace(a, b) : ���ڿ��� ��� a�� b�� ġȯ�Ѵ�.
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
			System.out.println("������ �����ϴ�.");
		} finally {
			if(pw != null) { pw.close(); }
		}
	}
	
//	MemoProject Ŭ�������� �ؽ�Ʈ ������ �̸��� �Ѱܹް� �ؽ�Ʈ ������ ������ ArrayList�� �����ϴ� �޼ҵ�
	public void fileReadMemo(String fileName) {
		Scanner sc = null;
		
		try {
			String path = "./src/memo/" + fileName + ".txt";
			sc = new Scanner(new File(path));
			
			while(sc.hasNextLine()) {
				String str = sc.nextLine().trim();		// �ؽ�Ʈ ������ ������ �� �� �д´�.
//				System.out.println(str);
//				�ؽ�Ʈ ���Ͽ��� ���� �� �ٿ��� ������ �����ڷ� ����ؼ� �о���̴� ��ĳ�ʸ� �����.
				Scanner scan = new Scanner(str);
				while(scan.hasNext()) {
					
//					�ؽ�Ʈ ������ ������ �о� ���� ������ �����Ѵ�.
					int no = scan.nextInt();
					String name = scan.next();
					String password = scan.next();
					String memo = scan.next();
					String writeDate = scan.next();
					
					MemoVO vo = new MemoVO(no, name, password, memo, writeDate);
					memoList.add(vo);
				}
			}
			
			System.out.println("���Ͽ��� �б�Ϸ�!!!");
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} finally {
			if(sc != null) { sc.close(); }
		}
		
	}
	
}

