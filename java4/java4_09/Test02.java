package java4_09;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] student = { { "aaa", "����", "1001" }, { "bbb", "����", "1002" }, { "ccc", "��ġ", "1003" },
				{ "ddd", "����", "1004" } };
		String[][] score = { { "��ȣ", "����", "����" }, { "1001", "����", "20" }, { "1002", "����", "50" },
				{ "1003", "����", "60" }, { "1004", "����", "17" }, { "1001", "����", "65" }, { "1002", "����", "15" },
				{ "1003", "����", "80" }, { "1004", "����", "70" }, { "1001", "����", "43" }, { "1002", "����", "90" },
				{ "1003", "����", "30" }, { "1004", "����", "70" } };

		int[][] total = new int[student.length][3];
		int maxNum = 0;
		int max = 0;
		for (int i = 0; i < total.length; i++) {
			total[i][0] = Integer.parseInt(student[i][2]);
			total[i][1] = i;
		}
		for (int i = 1; i < score.length; i++) {
			for (int j = 0; j < total.length; j++) {
				if (total[j][0] == Integer.parseInt(score[i][0])) {
					total[j][2] += Integer.parseInt(score[i][2]);
					
				}
			}
		}
		for (int i = 0; i < total.length; i++) {
			if (max < total[i][2]) {
				max = total[i][2];
				maxNum = total[i][1];
			}
		}
		for (int i = 0; i < total.length; i++) {
			System.out.println(total[i][0] + " " + student[total[i][1]][1] + " " + total[i][2]);
		}
		System.out.println("1��:"+student[maxNum][1]);
	}

}
