package gui_wordGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import gui_rankGame.Rank;
import gui_rankGame.UserInfo;

public class FileManager {
	File file = null; // 파일 존재 체크여부
	FileWriter fw = null; // 쓰기
	FileReader fr = null; // 읽기
	BufferedReader br = null; // 한줄씩 읽기
	final String path = "worddata.txt"; // 경로
	final String RANK_PATH = "rank.txt";
	String data = ""; // 데이타
	static int LOG = -1;
	boolean isLoad = false;
	Vector<Word> wordManager = null;

	public static FileManager instance = new FileManager();

	private FileManager() {
		wordManager = new Vector<>();
	}

	public void addWord(Word word) {
		wordManager.add(word);
		addData();
		saveData();
	}



	public void removeWord(int index) {
		wordManager.remove(index);
		addData();
		saveData();
	}

	public void updateWord(int index, String eng, String kor) {
		wordManager.get(index).eng = eng;
		wordManager.get(index).kor = kor;
		addData();
		saveData();

	}

	private void addData() {
		data = "";
		for (int i = 0; i < wordManager.size(); i++) {
			Word temp = wordManager.get(i);
			data += temp.eng;
			data += "/";
			data += temp.kor;
			data += "\n";
		}
	}

	private void saveData() {
		try {
			fw = new FileWriter(path);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printAllUser() {
		for (int i = 0; i < wordManager.size(); i++) {
			System.out.print(wordManager.get(i).eng + " ");
			System.out.print(wordManager.get(i).kor + " ");
		}
		System.out.println();
	}

	public void loadWord(String userTxt) {
		String wordinfo[] = userTxt.split("/");

		Word temp = new Word();
		temp.eng = wordinfo[0];
		temp.kor = wordinfo[1];
		wordManager.add(temp);
		printAllUser();
	}

	public void loadData() {
		wordManager.clear();
		file = new File(path);
		if (!file.exists())
			return;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			isLoad = false;
			data = "";
			while (true) {
				String wordTxt = br.readLine();
				if (wordTxt == null)
					break;
				if (!wordTxt.equals("\n")) {
					data += wordTxt;
					data += "\n";
					loadWord(wordTxt);
				}
				isLoad = true;
			}
			fr.close();
			br.close();
			if (isLoad) {
				System.out.println("== load ==\n" + data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
	// public void loadRankData() {
	// file = new File(RANK_PATH);
	// String rankData = "";
	//
	// try {
	// if(!file.exists()) return;
	//
	// fr = new FileReader(file);
	// br = new BufferedReader(fr);
	//
	// while(true) {
	// String line = br.readLine();
	// if(line == null) break;
	//
	// rankData += line;
	// rankData += "\n";
	// }
	// rankData = rankData.substring(0, rankData.length()-1);
	//
	// String[] temp = rankData.split("\n");
	// for(int i=0; i<temp.length; i++) {
	// String[] info = temp[i].split("/");
	// Rank.intstance.rank[i][0] = info[0];
	// Rank.intstance.rank[i][1] = info[1];
	// }
	//
	// }catch(Exception e) {
	// e.printStackTrace();
	// }finally {
	// if(fr != null) { try { fr.close(); } catch (IOException e) {} }
	// if(br != null) { try { br.close(); } catch (IOException e) {} }
	// }
	// }
	//
	// public void saveRankData() {
	//
	// String info = "";
	// for(int i=0; i<Rank.intstance.rank.length; i++) {
	// info += Rank.intstance.rank[i][0];
	// info += "/";
	// info += Rank.intstance.rank[i][1];
	// if(i != Rank.intstance.rank.length - 1) {
	// info += "\n";
	// }
	// }
	//
	// try {
	// fw = new FileWriter(RANK_PATH);
	// fw.write(info);
	// }catch(Exception e) {
	// e.printStackTrace();
	// }finally {
	// if(fw != null) { try { fw.close(); } catch (IOException e) {} }
	// }
	// }

	// String login(String id , String pw) {
	//
	// String check_id = "";
	// for(int i = 0; i < wordManager.size(); i++){
	// if(id.equals(wordManager.get(i).id) &&
	// pw.equals( wordManager.get(i).pw)) {
	// check_id = wordManager.get(i).id;
	// LOG = i;
	// break;
	// }
	// }
	// return check_id;
	// }
	// boolean checkID(String ID){
	// boolean check = false;
	// for(int i = 0; i < wordManager.size(); i++){
	// if(ID.equals(wordManager.get(i).id) ) {
	// check = true;
	// break;
	// }
	// }
	// return check;
	// }
	// String findID(String name , String mobile) {
	// String id = "";
	// for(int i = 0; i < wordManager.size(); i++){
	// if(name.equals(wordManager.get(i).name) &&
	// mobile.equals( wordManager.get(i).mobile)) {
	// id = wordManager.get(i).id;
	// break;
	// }
	// }
	// return id;
	// }
	// String findPW(String ID,String name,String mobile){
	// String id = "";
	// for(int i = 0; i < wordManager.size(); i++){
	// if(ID.equals(wordManager.get(i).name) &&
	// mobile.equals(
	// wordManager.get(i).mobile)&&name.equals(wordManager.get(i).name)) {
	// id = wordManager.get(i).pw;
	// break;
	// }
	// }
	// return id;
	// }

}
