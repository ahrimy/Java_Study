package java1_12;

public class IfEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		if(num%2==0){
			System.out.println("¦��");
		}
		if(num%2==1){
			System.out.println("Ȧ��");
		}
		
		if(num % 2 == 0) 
			System.out.println("¦��"); 
		
		if(num % 2 == 1)  
			System.out.println("Ȧ��"); 
		
		if(num % 2 == 0) { 
			System.out.println("¦��"); 
		}
		else { 
			System.out.println("Ȧ��"); 
		}
		
		/*
		 * if - else if ������
		 * ���� �� �Ϸ� ���� ���ǽ��� ������,
		 * ���� ������ �������� �ʴ´�.
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
