package java3_10;
import java.util.Scanner;
public class StringEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name = scan.next();
		
		System.out.println("name = "+name);
	}
}
