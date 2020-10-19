package gui_board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileManager {
	File file = null; // 파일 존재 체크여부
	FileWriter fw = null; // 쓰기
	FileReader fr = null; // 읽기
	BufferedReader br = null; // 한줄씩 읽기
	final String fileName = "board_gui.txt"; // 경로
	String data = ""; // 데이타
	static int LOG = -1;
	boolean isLoad = false;
	ArrayList<Board> boardList = null;

	public static FileManager instance = new FileManager();

	private FileManager() {
		boardList = new ArrayList<>();
	}

	public void addBoard(Board board) {
		boardList.add(board);
		addData();
		saveData();
	}

	public void removeBoard(int index) {
		boardList.remove(index);
		addData();
		saveData();
	}

	public void updateBoard(int index, String title, String content) {
		boardList.get(index).title = title;
		boardList.get(index).content = content;
		addData();
		saveData();
	}

	private void addData() {
		data = "";
		for (int i = 0; i < boardList.size(); i++) {
			Board temp = boardList.get(i);
			data += temp.title;
			data += "/";
			data += temp.content;
			data += "\n";
		}
	}

	private void saveData() {
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printAllUser() {
		for (int i = 0; i < boardList.size(); i++) {
			System.out.print(boardList.get(i).title + " ");
			System.out.print(boardList.get(i).content + " ");
		}
		System.out.println();
	}

	public void loadWord(String userTxt) {
		String info[] = userTxt.split("/");

		Board temp = new Board();
		temp.title = info[0];
		temp.content = info[1];
		boardList.add(temp);
		printAllUser();
	}

	public void loadData() {
		boardList.clear();
		file = new File(fileName);
		if (!file.exists())
			return;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			isLoad = false;
			data = "";
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				if (!line.equals("\n")) {
					data += line;
					data += "\n";
					loadWord(line);
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

}
