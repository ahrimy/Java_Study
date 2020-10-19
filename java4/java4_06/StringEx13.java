package java4_06;
import java.util.Scanner;
public class StringEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String name = "코끼리";
		char[] comName = new char[name.length()];
		for(int i=0;i<name.length();i++){
			comName[i] = name.charAt(i);
		}
		System.out.print("동물 이름을 입력하세요 : "); // ex) 티라노사우루스
		String myName = scan.next();
		int check=0;
		for(int i=0;i<name.length();i++){
			if(comName[i]==myName.charAt(i)){
				check=1;
				break;
			}
		}
		System.out.println(myName);
		if(check==0){
			
			System.out.println("출력 = false");
		}else{
			System.out.println("출력 = true");
		}
	}

}
