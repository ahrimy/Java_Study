package chapter01_02;

// # continue
// # for�� : ���������� ���� �̵�
// # while�� : ���ǽ����� �����̵�

// # break
// # ���� ����� �ݺ����� ����
public class Ex05 {
	public static void main(String[] args) {
		// 1���� 10 ������ �� �� 2�� ����� ���
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
