package java1_11;
import java.util.Random;
import java.util.Scanner;
public class RandomEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(2);
		System.out.print("가위(0)바위(1)보(2):");
		int me = scan.nextInt();
		if(com==me){
			System.out.println("Draw");
		}else if(com==0){
			if(me==1){
				System.out.println("Win");
			}else{
				System.out.println("Lose");
			}
		}else if(com==1){
			if(me==2){
				System.out.println("Win");
			}else{
				System.out.println("Lose");
			}
		}else if(com==2){
			if(me==0){
				System.out.println("Win");
			}else{
				System.out.println("Lose");
			}
		}
		System.out.println(com);
	}
}
