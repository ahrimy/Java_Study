package java4_14;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		int count = 0;

		String fileName = "vector.txt";

		while (true) {
			for (int i = 0; i < count; i++) {
				System.out.print(vector[i] + " ");
			}
			System.out.println();
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int[] temp = null;
			int input = 0;
			if (sel == 1) {
				System.out.print("추가할 값 입력:");
				input = scan.nextInt();
				temp = new int[count + 1];
				for (int i = 0; i < count; i++) {
					temp[i] = vector[i];
				}
				temp[count] = input;
				vector = temp;
				count++;
			} else if (sel == 2) {
				System.out.print("삭제할 번호(인덱스) 입력:");
				input = scan.nextInt();
				if(input<count&&input>=0){
				temp = new int[--count];
				for (int i = 0; i < input; i++) {
					temp[i] = vector[i];
				}
				for (int i = input; i < count; i++) {
					temp[i] = vector[i + 1];
				}
				vector = temp;
				}else{
					System.out.println("범위를 벗어남");
				}
			} else if (sel == 3) {
				if (count == 0) {
					System.out.println("저장할 값이 없음");
				} else {
					String data = "";

					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);// 새로 생성
						// fw = new FileWriter(fileName,true);//추가
						for (int i = 0; i < vector.length; i++) {
							data = vector[i] + "\n";
							fw.write(data);
						}
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 4) {
				String data = "";
				int size = 0;
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

						String[] fTemp = data.split("\n");
						size = fTemp.length;

						temp = new int[count + size];
						for (int i = 0; i < count; i++) {
							temp[i] = vector[i];
						}
						for (int i = count; i < temp.length; i++) {
							temp[i] = Integer.parseInt(fTemp[i - count]);
						}
						vector = temp;
						count += size;
						fr.close();
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			} else if (sel == 5)

			{
				break;
			}
		}
	}

}
