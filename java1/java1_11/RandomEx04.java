package java1_11;
import java.util.Scanner;
import java.util.Random;
public class RandomEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100)+1;
		int isOdd = rNum%2;//Ȧ�� = 1, ¦�� = 0
		System.out.println(rNum);
		System.out.print("Ȧ��(1)or¦��(0): ");
		int myAnswer = scan.nextInt();
		if(isOdd==myAnswer){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
}
