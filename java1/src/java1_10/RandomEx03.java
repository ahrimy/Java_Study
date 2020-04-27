package java1_10;
import java.util.Random;
public class RandomEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int rNum = ran.nextInt(10);
		
		if(rNum<3){
			System.out.println("´çÃ·");
		}else{
			System.out.println("²Î");
		}
	}

}
