package java1_10;
import java.util.Random;
public class RanomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran= new Random();
		
		int rNum = ran.nextInt(3);//0-2������ ����
		System.out.println(rNum);
		
		rNum = ran.nextInt(5)+1;
		System.out.println(rNum);//1-5������ ����
		
		rNum = ran.nextInt(7)-3;//-3~3������ ����
		System.out.println(rNum);
	}

}
