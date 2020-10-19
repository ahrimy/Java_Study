package java1_12;

public class IfEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		if(num%2==0){
			System.out.println("짝수");
		}
		if(num%2==1){
			System.out.println("홀수");
		}
		
		if(num % 2 == 0) 
			System.out.println("짝수"); 
		
		if(num % 2 == 1)  
			System.out.println("홀수"); 
		
		if(num % 2 == 0) { 
			System.out.println("짝수"); 
		}
		else { 
			System.out.println("홀수"); 
		}
		
		/*
		 * if - else if 구문은
		 * 다중 택 일로 참인 조건식을 만나면,
		 * 이하 조건은 실행하지 않는다.
		 */
		if(10 == 10) {
			System.out.println(10);
		}
		if(11 == 11) {
			System.out.println(11);
		}
		
		if(10 == 10) {
			System.out.println(10);
		}else if(11 == 11) {
			System.out.println(11);
		}	


	}

}
