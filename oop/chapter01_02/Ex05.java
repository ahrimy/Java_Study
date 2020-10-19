package chapter01_02;

// # continue
// # for문 : 증감식으로 강제 이동
// # while문 : 조건식으로 강제이동

// # break
// # 가장 가까운 반복문만 종료
public class Ex05 {
	public static void main(String[] args) {
		// 1부터 10 사이의 수 중 2의 배수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("---------");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------");
		int i = 1;
		while (i <= 10) {
			if(i%2==1){
				i++;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}

	}

}
