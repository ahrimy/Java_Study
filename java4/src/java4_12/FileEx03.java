package java4_12;
import java.io.FileWriter;
import java.io.IOException;
public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"±èÃ¶¼ö", "ÀÌ¸¸¼ö", "ÀÌ¿µÈñ"};
		int[]     ages = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		FileWriter fw = null;
		try{
			fw = new FileWriter(fileName);
			for(int i=0;i<names.length;i++){
				data = names[i] + " " +ages[i] +"\n";
				fw.write(data);
			}
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}



	}

}
