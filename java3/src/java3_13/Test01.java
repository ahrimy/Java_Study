package java3_13;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		int cnt = input.length();
		int num = Integer.parseInt(input);
		if(num>0&&num<=1000000){
			int[] data = new int[cnt];
			for(int i=0;i<cnt;i++){
				int unit = 1;
				for(int j=1;j<cnt-i;j++){
					unit*=10;
				}
				data[i] = num/unit;
				num%=unit;
			}

			int mid = cnt/2;
			if(cnt%2==1){
			System.out.println(data[mid]);
			}else{
				System.out.println("짝수의 자리이다");
			}
		}
	}

}
