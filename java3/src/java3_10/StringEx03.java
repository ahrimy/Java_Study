package java3_10;

public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = {"홍길동", "김유신", "김동석", "자바킹", "서동요"};
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				if(names[j].compareTo(names[j+1])>0){
					System.out.println(names[j] + " "+names[j+1]+" "+names[j].compareTo(names[j+1]));
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<5;i++){
			System.out.print(names[i]+" ");
		}
		


	}

}
