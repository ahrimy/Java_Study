package java4_09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		String[][] total = new String[4][3];
		int maxNum = 0;
		int max = 0;
		for(int i=0;i<total.length;i++){
			total[i][0] = score[i][0];
			int temp = 0;
			for(int j=1;j<score[i].length;j++){
				temp+= Integer.parseInt(score[i][j]);
			}
			if(max<temp){
				maxNum = i;
				max = temp;
			}
			total[i][1] = String.valueOf(temp);
			for(int j=0;j<student.length;j++){
				if(total[i][0].equals(student[j][2])){
					total[i][2] = student[j][1];
				}
			}
			System.out.println(total[i][0]+" "+total[i][1]+" "+total[i][2]);
			
		}
		System.out.println("1등:"+total[maxNum][2]);
		
	}

}
