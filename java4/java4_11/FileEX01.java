package java4_11;
import java.io.FileWriter;
import java.io.IOException;
public class FileEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "ex01.txt";
		
		FileWriter fw = null;
		try{
			fw = new FileWriter(fileName);
			fw.write("���������ϱ� ��������");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
