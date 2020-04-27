package java1_08;
import java.util.Scanner;
public class IfEx08_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		int height = scan.nextInt();
		if(height>=120){
			System.out.println("이용가능");
		}else{
			System.out.print("부모님과 함께 오셨나요?(yes:1,no:0)");
			int withpar = scan.nextInt();

			if(withpar == 1){
				System.out.println("이용가능");
			}else{
				System.out.println("이용불가");
			}
		}
	}

}
