package java4_06;
import java.util.Scanner;
public class StringEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String name = "�ڳ���";
		char[] comName = new char[name.length()];
		for(int i=0;i<name.length();i++){
			comName[i] = name.charAt(i);
		}
		System.out.print("���� �̸��� �Է��ϼ��� : "); // ex) Ƽ�����罺
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
			
			System.out.println("��� = false");
		}else{
			System.out.println("��� = true");
		}
	}

}
