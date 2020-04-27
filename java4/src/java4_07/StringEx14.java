package java4_07;

import java.util.Scanner;
public class StringEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		
		int ifNum = 0;
		int ifChar = 0;
		
		for(int i=0;i<text.length();i++){
			char ch = text.charAt(i);
			int aNum = (int)ch;
			if(aNum>48&&aNum<58){
				ifNum=1;
			}
			else{
				ifChar=1;
			}
		}
		if(ifNum==1&&ifChar==1){
			System.out.println("문자/숫자");
		}else if(ifNum==1&&ifChar==0){
			System.out.println("숫자");
		}else if(ifNum==0&&ifChar==1){
			System.out.println("문자");
		}else{
			System.out.println("에러");
		}

	}

}
