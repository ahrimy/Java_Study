package gui_mealTicket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class FileManager {
	File file = null; // 파일 존재 체크여부
	FileWriter fout = null; // 쓰기
	FileReader reader = null; // 읽기
	BufferedReader br = null; // 한줄씩 읽기
	final String path = "ticketData.txt"; // 경로
	String data = ""; // 데이타
	boolean isLoad = false;
	//ArrayList<Data> dataManager = null;
	HashMap<String,Data> dataManager = null;
	int ticketCnt = 0;

	public static FileManager instance = new FileManager();

	private FileManager() {
		dataManager = new HashMap<>();
	}

	public void add() {
		data="";
		addData();
		saveData();
	}

	private void addData() {
		// int lastIndex = dataManager.size() - 1;
		// Data temp = dataManager.get(lastIndex);
		for(String key:dataManager.keySet()){
			Data temp = dataManager.get(key);
			data += temp.getName();
			data += "/";
			data += temp.getPrice() + "";
			data += "/";
			data += temp.getCnt();
			data += "\n";
				
		}
		System.out.println("== save ==\n" + data);
	}

	private void saveData() {
		try {
			fout = new FileWriter(path);
			fout.write(data);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void load(String userTxt) {
		String dataInfo[] = userTxt.split("/");
		for (int i = 0; i < dataInfo.length; i++) {
			// System.out.println(userinfo[i]);
		}

		Data temp = new Data(dataInfo[0],Integer.parseInt(dataInfo[1]),Integer.parseInt(dataInfo[2]));

		dataManager.put(temp.getName(),temp);

	}
public void init(){
	dataManager.put("ticket",new Data("ticket",2300,0));
	dataManager.put("50000",new Data("50000",50000,0));
	dataManager.put("10000",new Data("10000",10000,0));
	dataManager.put("5000",new Data("5000",5000,0));
	dataManager.put("1000",new Data("1000",1000,0));
	dataManager.put("500",new Data("500",500,0));
	dataManager.put("100",new Data("100",100,0));
	System.out.println("Init");
	
}
	public void loadData() {
		file = new File(path);
		if (file.exists()) {
			try {
				reader = new FileReader(path);
				br = new BufferedReader(reader);
				isLoad = false;
				data = "";
				while (true) {
					String userTxt = br.readLine();
					if (userTxt == null)
						break;
					data += userTxt;
					data += "\n";

					load(userTxt);
					isLoad = true;
				}
				reader.close();
				br.close();
				if (isLoad) {
					System.out.println("== load ==\n" + data);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			init();
		}
	}

}
