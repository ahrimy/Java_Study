package java4_22;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "10001/±èÃ¶¼ö/600\n";
		data += "10002/ÀÌ¿µÈñ/800\n";
		data += "10001/±èÃ¶¼ö/1400\n";
		data += "10003/À¯Àç¼®/780\n";
		data += "10002/ÀÌ¿µÈñ/950\n";
		data += "10004/¹Ú¸í¼ö/330\n";
		data += "10001/±èÃ¶¼ö/670\n";
		data += "10003/À¯Àç¼®/3300\n";
		data += "10002/ÀÌ¿µÈñ/200\n";
		data += "10004/¹Ú¸í¼ö/6800\n";
		data = data.substring(0, data.length() - 1); // ¸¶Áö¸· ±Û»èÁ¦
		System.out.println(data);
		System.out.println("=====================");
		String[] tokens = data.split("\n");
		int totalSize = tokens.length;

		int numList[] = new int[totalSize];
		String nameList[] = new String[totalSize];
		int priceList[] = new int[totalSize];

		for (int i = 0; i < totalSize; i++) {
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}

		for (int i = 0; i < totalSize; i++) {
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		int[][] list = new int[totalSize][3];
		int cnt = 0;
		
		for(int i=0;i<totalSize;i++){
			int check = 0;
			for(int j=0;j<cnt;j++){
				if(list[j][0]==numList[i]){
					list[j][2]+=priceList[i];
					check = 1;
				}
			}
			if(check==0){
				list[cnt][0] = numList[i];
				list[cnt][1] = i;
				list[cnt][2] = priceList[i];
				cnt++;
			}
			
		}
		
		for(int i=0;i<cnt;i++){
			System.out.println(list[i][0]+"/"+nameList[list[i][1]]+"/"+list[i][2]);
		}
	}

}
