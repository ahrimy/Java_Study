package java1_11;
import java.util.Scanner;
import java.util.Random;
public class RandomEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100)+1;
		int isOdd = rNum%2;//È¦¼ö = 1, Â¦¼ö = 0
		System.out.println(rNum);
		System.out.print("È¦¼ö(1)orÂ¦¼ö(0): ");
		int myAnswer = scan.nextInt();
		if(isOdd==myAnswer){
			System.out.println("Á¤´ä");
		}else{
			System.out.println("¿À´ä");
		}
	}
}
