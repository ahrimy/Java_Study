package java4_01;

public class StringEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자 -> 숫자
				char ch = '9';
				int aNum = (int)ch;
				System.out.println(aNum);					// 97
				
				ch = (char)(aNum + 1);
				System.out.println(ch);						// b
				
				// 문자열 -> 숫자
				String strNum = "10";
				int num = Integer.parseInt(strNum);
				System.out.println(num + 1);				// 11
				
				// 숫자 -> 문자열
				// 방법1) 꼼수
				strNum = num + "";
				System.out.println(strNum + 1);				// 101
				// 방법2) 정식
				strNum = String.valueOf(num);
				System.out.println(strNum + 1);				// 101



	}

}
