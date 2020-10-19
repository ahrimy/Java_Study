package java1_08;
import java.util.Scanner;
public class IfEx07_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int score = scan.nextInt();
		if(score<0||score>100){
			System.out.println("성적을 잘못 입력했습니다.");
		}
		else if(score>=60){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
	}

}
