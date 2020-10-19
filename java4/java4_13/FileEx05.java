package java4_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;

		String fileName = "fileTest02.txt";

		File file = new File(fileName);
		
		String data = "";
		int size = 0;
		FileReader fr = null;
		BufferedReader br = null;
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					System.out.println(line);
					if(line==null){
						break;
					}
					data+=line;
					data+="\n";
					
				}
				data = data.substring(0,data.length()-1);
				String[] temp = data.split("\n");
				size = temp.length;
				ids = new String[size];
				pws = new String[size];
				moneys = new int[size];
				
				for(int i=0;i<size;i++){
					String[] info = temp[i].split(" ");
					ids[i] = info[0];
					pws[i] = info[1];
					moneys[i] = Integer.parseInt(info[2]);
				}
				
				fr.close();
				br.close();
				for(int i=0;i<size;i++){
					System.out.println(ids[i]+" "+pws[i]+" "+moneys[i]);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
