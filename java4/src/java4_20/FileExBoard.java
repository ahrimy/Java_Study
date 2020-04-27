package java4_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileExBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String fileName = "board.txt";

		String[][] board = null;
		int count = 0; // ��ü �Խñ� ��
		int pageSize = 5; // �� �������� ������ �Խñ� ��
		
		int curPageNum = 0; // ���� ������ ��ȣ
		int pageCount = 0; // ��ü ������ ����
		int startRow = 0; // ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0; // ���� �������� �Խñ� ������ ��ȣ

		String data = "";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				data = data.substring(0, data.length() - 1);

				String[] temp = data.split("\n");
				count = temp.length;

				board = new String[count][2];

				for (int i = 0; i < count; i++) {
					String[] info = temp[i].split(" ");
					board[i][0] = info[0];
					board[i][1] = info[1];
				}

				fr.close();
				br.close();
				if(count>0){
					curPageNum=1;
				}else{
					curPageNum=0;
				}
				if (count > pageSize) {
					endRow = pageSize;
				} else {
					endRow = count;
				}
				if (count % pageSize == 0) {
					pageCount = count / pageSize;
				} else {
					pageCount = (count / pageSize)+1;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		while (true) {
			System.out.println();
			System.out.println("[[�Խ���]]");
			for (int i = startRow; i < endRow; i++) {
				System.out.println("(" + (i + 1) + ") " + board[i][0]);
			}
			System.out.println();
			if (curPageNum > 0) {
				System.out.println("//" + curPageNum + "//");
			} else {
				System.out.println("//�Խñ� ����//");
			}
			System.out.println();
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("[0]����");

			int choice = scan.nextInt();

			if (choice == 1) {
				if (curPageNum > 1) {
					curPageNum--;

					startRow = startRow - 5;
					endRow = startRow + pageSize;

				} else {
					System.out.println("ù��° ������ �Դϴ�.");
				}
			} else if (choice == 2) {
				if (curPageNum < pageCount) {
					curPageNum++;

					startRow = endRow;
					if (curPageNum == pageCount) {
						endRow = count;
					} else {
						endRow = startRow + pageSize;
					}

				} else {
					System.out.println("������ ������ �Դϴ�.");
				}
			} else if (choice == 3) {
				String[][] temp = new String[count + 1][2];
				for (int i = 0; i < count; i++) {
					temp[i] = board[i];
				}
				System.out.print("������ �Է��ϼ���:");
				temp[count][0] = scan.next();
				System.out.print("������ �Է��ϼ���:");
				temp[count][1] = scan.next();
				board = temp;
				if (count % pageSize == 0) {
					count++;
					if (curPageNum == pageCount) {
						startRow = endRow;
						endRow = count;
						curPageNum++;
					}
					pageCount++;
				} else {
					count++;
					if (curPageNum == pageCount) {
						endRow++;
					}
				}

			} else if (choice == 4) {
				String[][] temp = new String[count - 1][2];
				if (count > 0) {
					System.out.print("������ ��ȣ�� �Է��ϼ���:");
					int num = scan.nextInt();
					count--;
					for (int i = 0; i < num - 1; i++) {
						temp[i] = board[i];
					}
					for (int i = num - 1; i < count; i++) {
						temp[i] = board[i + 1];
					}
					board = temp;

					if (count % pageSize == 0) {
						if (curPageNum == pageCount) {
							curPageNum--;
							if (count == 0) {
								startRow = 0;
								endRow = 0;
							} else {
								startRow -= 5;
								endRow = startRow + pageSize;
							}
						}
						pageCount--;
					} else {
						if (curPageNum == pageCount) {
							endRow--;
						}
					}
				} else {

				}
			} else if (choice == 5) {
				System.out.print("�Խñ� ��ȣ�� �Է��ϼ���:");
				int num = scan.nextInt();
				if (num > startRow && num <= endRow) {
					System.out.println("<<" + num + "�� �Խñ� ����>>");
					System.out.println(board[num - 1][1]);
				} else {

				}
			}else if(choice==0){
				break;
			}
		}

		data = "";
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			for (int i = 0; i < count; i++) {
				data += board[i][0];
				data += " ";
				data += board[i][1];
				data += "\n";
				
			}
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
	}

}
