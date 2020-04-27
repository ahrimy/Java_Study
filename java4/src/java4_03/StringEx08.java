package java4_03;

public class StringEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "±èÃ¶¼ö/87,ÀÌ¸¸¼ö/42,ÀÌ¿µÈñ/95";

		String[] name = new String[3];
		int[] score = new int[3];
		String temp[] = str.split(",");
		for(int i=0;i<3;i++){
			String[] info = temp[i].split("/");
			name[i] = info[0];
			score[i] = Integer.parseInt(info[1]);
			System.out.println("ÀÌ¸§:"+name[i]+" Á¡¼ö:"+score[i]);
		}
		
	}

}
