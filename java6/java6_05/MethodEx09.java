package java6_05;

import java.util.Scanner;

class Student {
	int hakbun;
	int score;
}

class Ex09 {
	void test1(int[] x) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			x[i] = scan.nextInt();
		}
	};

	int test2(int[] x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		return total;
	}

	double test3(int[] x) {
		int total = test2(x);
		double avg = total / (double) x.length;
		return avg;
	}

	int test4(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] >= 60) {
				count++;
			}
		}
		return count;
	}

	int test5(int[] x, int idx) {
		return x[idx];
	}

	int test6(int[] x, int score) {
		int check = -1;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == score) {
				check = i;
			}
		}
		return check;
	}

	int test7(int[] x, int[] y, int hakbun) {
		int idx = -1;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == hakbun) {
				idx = i;
			}
		}
		if (idx == -1) {
			return -1;
		} else {
			return y[idx];
		}
	}

	Student test8(int[] x, int[] y) {
		Student s = new Student();
		int max = 0;
		int idx = -1;
		for (int i = 0; i < y.length; i++) {
			if (y[i] > max) {
				max = y[i];
				idx = i;
			}
		}
		s.score = max;
		s.hakbun = x[idx];
		return s;
	}
}

public class MethodEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 e = new Ex09();

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ���� �޼���
		// �� 1) 87, 11, 92, 14, 47
		e.test1(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		// ����2) �������� ���� ���� �޼���
		// �� 2) ����(251) ���(50.2)
		int total = e.test2(scores);
		System.out.println(total);
		// ����3) �������� ��� ���� �޼���
		// �� 3) ���(50.2)
		double avg = e.test3(scores);
		System.out.println(avg);
		// ����4) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���� �޼���
		// �� 4) 2��
		int count = e.test4(scores);
		System.out.println(count);

		// ����5) �ε����� ���޹޾� ���� ���� �޼���
		// ����5) �ε��� �Է� : 1 ���� : 11��
		int score = e.test5(scores, 1);
		System.out.println(score);

		// ����6) ������ ���޹޾� �ε��� ���� �޼���
		// ��, ���� ���� �Է� �� ����ó��
		// ����6) ���� �Է� : 11 �ε��� : 1
		int idx = e.test6(scores, 11);
		System.out.println(idx);

		// ����7) �й��� ���޹޾� ���� ���� �޼���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش� �й��� �������� �ʽ��ϴ�.
		idx = e.test7(hakbuns, scores, 1000);
		if(idx==-1){
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else{
			System.out.println(hakbuns[idx]+" :   "+scores[idx]);
		}

		// ����9) 1���л��� �й��� ������ Ŭ���� Ÿ��(Student Ŭ����)���� ���� �޼���
		// ����9) 1004��(98��)
		Student s = e.test8(hakbuns, scores);
		System.out.println(s.hakbun+" : "+s.score);

	}

}
