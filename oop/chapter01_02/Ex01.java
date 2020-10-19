package chapter01_02;

/*
 * #제어문(control statement)
 * 1.조건문 : if, switch-case
 * 2.반복문 : for, while, do-while
 * 3.보조 제어문(*) : break, continue
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =5;
		if(month==3||month==4||month==5){
			System.out.println("봄");
		}else if(month==6||month==7||month==8){
			System.out.println("여름");
		}else if(month==9||month==10||month==11){
			System.out.println("가을");
		}else if(month==12||month==1||month==2){
			System.out.println("겨울");
		}else{
			System.out.println("잘못된 입력");
		}
		//----------------------------------
		switch(month){ //()안에는 정수 or 문자(열)		
		case 3:
		case 4:
		case 5:
			System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("어름"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을"); break;
		case 12: case 1: case 2:
			System.out.println("겨울"); break;
		default :
			System.out.println("잘못입력했어요!");
		}
	}

}
