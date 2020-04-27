package java1_13;
import java.util.Random;

public class IfEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int rNum = ran.nextInt(50)+1;
		int count = 0;
		int fNum = rNum/10;
		int lNum = rNum%10;
		
		if(fNum==3||fNum==6||fNum==9){
			count++;
		}
		if(lNum==3||lNum==6||lNum==9){
			count++;
		}
		if(count==0){
			System.out.println(rNum +" : "+rNum);
		}else if(count==1){
			System.out.println(rNum+" : ¦");
		}else if(count==2){
			System.out.println(rNum+" : ¦¦");
		}else{
			System.out.println("Error");
		}
	}

}
