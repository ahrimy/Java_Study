package java1_10;
import java.util.Random;
import java.util.Scanner;
public class RandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int coin = ran.nextInt(2);
		System.out.print("�ո�(0)or�޸�(1): ");
		int myAnswer = scan.nextInt();
		if(coin==myAnswer){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		System.out.println(coin);
	}

}
