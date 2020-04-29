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

		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.test1(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		// 문제2) 전교생의 총점 리턴 메서드
		// 예 2) 총점(251) 평균(50.2)
		int total = e.test2(scores);
		System.out.println(total);
		// 문제3) 전교생의 평균 리턴 메서드
		// 예 3) 평균(50.2)
		double avg = e.test3(scores);
		System.out.println(avg);
		// 문제4) 성적이 60점 이상이면 합격. 합격생 수 리턴 메서드
		// 예 4) 2명
		int count = e.test4(scores);
		System.out.println(count);

		// 문제5) 인덱스를 전달받아 성적 리턴 메서드
		// 정답5) 인덱스 입력 : 1 성적 : 11점
		int score = e.test5(scores, 1);
		System.out.println(score);

		// 문제6) 성적을 전달받아 인덱스 리턴 메서드
		// 단, 없는 성적 입력 시 예외처리
		// 정답6) 성적 입력 : 11 인덱스 : 1
		int idx = e.test6(scores, 11);
		System.out.println(idx);

		// 문제7) 학번을 전달받아 성적 리턴 메서드
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당 학번은 존재하지 않습니다.
		idx = e.test7(hakbuns, scores, 1000);
		if(idx==-1){
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else{
			System.out.println(hakbuns[idx]+" :   "+scores[idx]);
		}

		// 문제9) 1등학생의 학번과 성적을 클래스 타입(Student 클래스)으로 리턴 메서드
		// 정답9) 1004번(98점)
		Student s = e.test8(hakbuns, scores);
		System.out.println(s.hakbun+" : "+s.score);

	}

}
