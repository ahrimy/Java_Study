package java4_12;
import java.io.FileWriter;
import java.io.IOException;
public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		
		FileWriter fw = null;
		try{
			fw = new FileWriter(fileName);//새로 생성
			//fw = new FileWriter(fileName,true);//추가
			for(int i=0;i<names.length;i++){
				data = names[i] + " "+pws[i]+" "+moneys[i]+"\n";
				fw.write(data);
			}
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		



	}

}
