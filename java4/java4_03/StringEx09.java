package java4_03;

public class StringEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"±èÃ¶¼ö", "ÀÌ¸¸¼ö","ÀÌ¿µÈñ"};
		int[] score = {87,42,95};
		
		String str = "";
		String[] info = new String[3];
		for(int i=0;i<3;i++){
			info[i] = name[i]+"/"+String.valueOf(score[i]);
		}
		String text = "\"";
		for(int i=0;i<3;i++){
			if(i<2){
				text+=info[i];
				text+=",";
			}else{
				text+=info[i];
				text+="\"";
			}
		}
		System.out.println(text);
	}

}
