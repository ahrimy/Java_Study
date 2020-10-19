package java4_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;
		
		String userFile = "user.txt";
		String jangFile = "jang.txt";

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종     료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					int check = 0;
					System.out.print("Enter an Id:");
					String input = scan.next();
					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(input)) {
							check = 1;
							System.out.print("Enter a Password:");
							input = scan.next();
							if (pws[i].equals(input)) {
								log = i;
								System.out.println("Complete logging in");
							} else {
								System.out.println("Password is not correct");
							}
							break;
						}
					}
					if (check == 0) {
						System.out.println("This Id does not exist");
					}

				} else {
					System.out.println("Account " + ids[log] + " is logging in");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account " + ids[log] + " Sucessfully logged out");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					while (true) {
						System.out.println("[1]물건 고르기");
						System.out.println("[2]뒤로가기");
						int choice = scan.nextInt();
						if (choice == 1) {
							if (count < MAX_SIZE) {
								for (int i = 0; i < items.length; i++) {
									System.out.println("(" + (i + 1) + ") " + items[i]);
								}
								System.out.print("Select item number:");
								int iNum = scan.nextInt();
								jang[count][0] = log;
								jang[count][1] = iNum;
								count++;
							} else {
								System.out.println("Cart is full");
							}
						} else {
							break;
						}
					}
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					int apple = 0;
					int banana = 0;
					int strawberry = 0;

					for (int i = 0; i < count; i++) {
						if (jang[i][0] == log) {
							if (jang[i][1] == 1) {
								apple++;
							} else if (jang[i][1] == 2) {
								banana++;
							} else if (jang[i][1] == 3) {
								strawberry++;
							}
						}
					}
					System.out.println("Apple:" + apple);
					System.out.println("Banana:" + banana);
					System.out.println("Strawberry:" + strawberry);
				}
			} else if (sel == 5) {
				if(ids.length==0){
					System.out.println("The account storage is empty");
				}else{
					String userData = "";
					FileWriter userFw = null;
					for(int i=0;i<ids.length;i++){
						userData += (ids[i] + " "+pws[i]+"\n");
					}

					String jangData = "";
					FileWriter jangFw = null;
					if(count>0){
						for(int i=0;i<count;i++){
							jangData += (jang[i][0] + " "+jang[i][1]+"\n");
						}
						try{
							userFw =new FileWriter(userFile);
							jangFw = new FileWriter(jangFile);
							
							userFw.write(userData);
							jangFw.write(jangData);
							
							userFw.close();
							jangFw.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					}else{
						System.out.println("JangData doesnt exists");
					}
					try{
						userFw =new FileWriter(userFile);
						jangFw = new FileWriter(jangFile);
						
						userFw.write(userData);
						jangFw.write(jangData);
						
						userFw.close();
						jangFw.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}

			} else if (sel == 6) {
				String jangData = "";
				int size = 0;
				File file = new File(jangFile);
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
							jangData += line;
							jangData += "\n";
						}
						jangData = jangData.substring(0, jangData.length() - 1);

						String[] temp = jangData.split("\n");
						size = temp.length;

						for (int i = 0; i < size; i++) {
							String[] info = temp[i].split(" ");
							jang[i][0] = Integer.parseInt(info[0]);
							jang[i][1] = Integer.parseInt(info[1]);
							count = size;
						}
						fr.close();
						br.close();
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					for(int i=0;i<count;i++){
						if(jang[i][0]==0){
							System.out.print("qwer");
						}else if(jang[i][0]==1){
							System.out.print("javaking");
						}else if(jang[i][0]==2){
							System.out.print("abcd");
						}
						System.out.print(" : ");
						if(jang[i][1]==1){
							System.out.println("사과");
						}else if(jang[i][1]==2){
							System.out.println("바나나");
						}else if(jang[i][1]==3){
							System.out.println("딸기");
						}
					}

				}
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
