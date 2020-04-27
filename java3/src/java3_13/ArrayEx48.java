package java3_13;

public class ArrayEx48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jangCount = 5;
		String[][] jang = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
		};
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		System.out.println();
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				if(jang[j][0].compareTo(jang[j+1][0])>0){
					String[] temp = new String[2];
					temp = jang[j];
					jang[j] = jang[j+1];
					jang[j+1] = temp;
				}else if(jang[j][0].compareTo(jang[j+1][0])==0){
					if(jang[j][1].compareTo(jang[j+1][1])>0){
						String[] temp = new String[2];
						temp = jang[j];
						jang[j] = jang[j+1];
						jang[j+1] = temp;
					}
				}

			}
		}
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}


	}

}
