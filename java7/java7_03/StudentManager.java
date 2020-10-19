package java7_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
	String id = "";
	String pw = "";

	void set_data(String i, String p) {
		id = i;
		pw = p;
	}

	void print_data() {
		System.out.println("�̸� : " + id + " ��й�ȣ : " + pw);
	}
}

class Manager {
	Scanner scan = new Scanner(System.in);
	Student[] list = null;
	int count = 0;

	void makeAccount() {
		System.out.print("ID: ");
		String id = scan.next();
		int check = 0;
		for (int i = 0; i < count; i++) {
			if (id.equals(list[i].id)) {
				System.out.println("This Id already exists");
				check = 1;
				break;
			}
		}
		if (check == 0) {

			System.out.print("PW: ");
			String pw = scan.next();
			Student temp[] = new Student[count + 1];
			for (int i = 0; i < count; i++) {
				temp[i] = list[i];
			}
			temp[count] = new Student();
			temp[count].set_data(id, pw);
			count++;
			list = temp;

		} 
	}

	void delAccount() {
		if (count > 0) {
			System.out.print("ID: ");
			String id = scan.next();
			int check = -1;
			for (int i = 0; i < count; i++) {
				if (id.equals(list[i].id)) {
					check = i;
					break;
				}
			}
			if (check > -1) {
				System.out.print("PW: ");
				String pw = scan.next();
				if (pw.equals(list[check].pw)) {
					Student temp[] = new Student[--count];
					for (int i = 0; i < check; i++) {
						temp[i] = list[i];
					}
					for (int i = check; i < count; i++) {
						temp[i] = list[i + 1];
					}
					list = temp;
				} else {
					System.out.println("Password is not correct");
				}
			} else {
				System.out.println("This Id doesn't exists");

			}
		}else {
			System.out.println("There is no account");
		}

	}

	void sortAccount() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - (i + 1); j++) {
				if (list[j].id.compareTo(list[j + 1].id) > 0) {
					Student temp = new Student();
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
	}

	void printAccount() {
		for (int i = 0; i < count; i++) {
			list[i].print_data();
		}
	}

	void saveAccount(String fileName) {
		String data = count + "\n";
		for (int i = 0; i < count; i++) {
			data += list[i].id;
			data += ", ";
			data += list[i].pw;
			data += "\n";
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
				}
			}
		}
	}

	void loadAccount(String fileName) {
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

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
					}
				}
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
					}
				}
			}
		}
		data = data.substring(0, data.length() - 1);
		String[] temp = data.split("\n");
		count = Integer.parseInt(temp[0]);
		list = new Student[count];
		for (int i = 0; i < count; i++) {
			String info[] = temp[i + 1].split(", ");
			Student input = new Student();
			input.set_data(info[0], info[1]);
			list[i] = input;

		}
	}
}

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Manager manager = new Manager();
		String fileName = "AccountList.txt";
		boolean run = true;
		while (run) {
			System.out.println("1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�");
			int sel = scan.nextInt();

			/*
			 * [1] ���� : ID �ߺ��˻� ���� [2] Ż�� : ID�� �Է¹޾� Ż�� [3] ���� : �̸��� ������� ������ ����
			 * [4] ���� : �Ʒ��� ���� �������� ���� ��) 2 // ȸ�� �� qwer,1234 // id,pw abcd,1111
			 * // id, pw
			 */

			if (sel == 1) {
				manager.makeAccount();
			} else if (sel == 2) {
				manager.delAccount();
			} else if (sel == 3) {
				manager.sortAccount();
			} else if (sel == 4) {
				manager.printAccount();
			} else if (sel == 5) {
				manager.saveAccount(fileName);
			} else if (sel == 6) {
				manager.loadAccount(fileName);
			}

		}
	}

}
