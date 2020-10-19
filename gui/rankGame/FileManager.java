package gui_rankGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	File file = null; // 파일 존재 체크여부
	FileWriter fw = null; // 쓰기
	FileReader fr = null; // 읽기
	BufferedReader br = null; // 한줄씩 읽기
	final String path = "userdata.txt"; // 경로
	final String RANK_PATH = "rank.txt";	
	String data = ""; // 데이타
	static int LOG = -1;
	boolean isLoad = false;
	ArrayList <UserInfo> userManager = null;
	
	public static FileManager instance = new FileManager();
	
	private FileManager() {
		userManager = new ArrayList<>();
	}
	public void addUser(UserInfo user) {
		userManager.add(user);	
		addData(user);
		saveData();
	}
	private void addData(UserInfo user) {
		int lastIndex = userManager.size() - 1;
		UserInfo temp = userManager.get(lastIndex);
		data += temp.name;
		data += "/";
		data += temp.age + "";
		data += "/";
		data += temp.mobile;
		data += "/";
		data += temp.id;
		data += "/";
		data += temp.pw;
		data += "\n";
		System.out.println("== save ==\n" + data);
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
		for(int i = 0; i < userManager.size(); i++) {
			System.out.print(userManager.get(i).name + " ");
			System.out.print(userManager.get(i).age + " ");
			System.out.print(userManager.get(i).mobile + " ");
			System.out.print(userManager.get(i).id + " ");
			System.out.println(userManager.get(i).pw);
		}
	}
	public void loadUser(String userTxt) {
		String userinfo[] = userTxt.split("/");
		for(int i = 0; i < userinfo.length; i++) {
		//	System.out.println(userinfo[i]);
		}
		
		UserInfo temp = new UserInfo();
		temp.name = userinfo[0];
		temp.age = Integer.parseInt(userinfo[1]);
		temp.mobile = userinfo[2];
		temp.id = userinfo[3];
		temp.pw = userinfo[4];
		userManager.add(temp);
		printAllUser();
	}
	public void loadData() {
		file = new File(path);
		if (!file.exists())
			return;		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			isLoad = false;
			data = "";
			while (true) {
				String userTxt = br.readLine();
				if (userTxt == null)
					break;
				data += userTxt;
				data += "\n";
				
				loadUser(userTxt);
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
	public void loadRankData() {
		file = new File(RANK_PATH);
		String rankData = "";
		
		try {
			if(!file.exists())	return;
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				
				rankData += line;
				rankData += "\n";
			}
			rankData = rankData.substring(0, rankData.length()-1);
			
			String[] temp = rankData.split("\n");
			for(int i=0; i<temp.length; i++) {
				String[] info = temp[i].split("/");
				Rank.intstance.rank[i][0] = info[0];
				Rank.intstance.rank[i][1] = info[1];
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) { try { fr.close(); } catch (IOException e) {} }
			if(br != null) { try { br.close(); } catch (IOException e) {} }
		}
	}
	
	public void saveRankData() {
		
		String info = "";
		for(int i=0; i<Rank.intstance.rank.length; i++) {
			info += Rank.intstance.rank[i][0];
			info += "/";
			info += Rank.intstance.rank[i][1];
			if(i != Rank.intstance.rank.length - 1) {
				info += "\n";
			}
		}
		
		try {
			fw = new FileWriter(RANK_PATH);
			fw.write(info);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fw != null) { try { fw.close(); } catch (IOException e) {} }
		}
	}
	
	String login(String id , String pw) {
		
		String check_id = "";	
		for(int i = 0; i < userManager.size(); i++){
			if(id.equals(userManager.get(i).id) && 
					pw.equals( userManager.get(i).pw)) {
				check_id = userManager.get(i).id;
				LOG = i;
				break;
			}
		}	
		return check_id;
	}
	boolean checkID(String ID){
		boolean check = false;			
		for(int i = 0; i < userManager.size(); i++){
			if(ID.equals(userManager.get(i).id) ) {
				check = true;
				break;
			}
		}	
		return check;
	}
	String findID(String name , String mobile) {
		String id = "";			
		for(int i = 0; i < userManager.size(); i++){
			if(name.equals(userManager.get(i).name) && 
			   mobile.equals( userManager.get(i).mobile)) {
				id = userManager.get(i).id;
				break;
			}
		}	
		return id;
	}
	String findPW(String ID,String name,String mobile){
		String id = "";
		for(int i = 0; i < userManager.size(); i++){
			if(ID.equals(userManager.get(i).name) && 
			   mobile.equals( userManager.get(i).mobile)&&name.equals(userManager.get(i).name)) {
				id = userManager.get(i).pw;
				break;
			}
		}	
		return id;
	}

}
