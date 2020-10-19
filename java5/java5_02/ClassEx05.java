package java5_02;
import java.util.Scanner;
class Ex05{
	String name =  "";
	
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
}
public class ClassEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		
		while(true) {
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for(int i=0;i<mega.arHakbun.length;i++){
					System.out.println(mega.arHakbun[i]+ " : "+mega.arScore[i]);
				}
			}
			else if(choice == 2) {
				int max = 0;
				int maxNum = 0;
				for(int i=0;i<mega.arScore.length;i++){
					if(max<mega.arScore[i]){
						max = mega.arScore[i];
						maxNum = mega.arHakbun[i];
					}
				}
				System.out.println(maxNum +" "+max);
			}
			else if(choice == 3) {
				int min = 100;
				int minNum = 0;
				for(int i=0;i<mega.arScore.length;i++){
					if(min>mega.arScore[i]){
						min = mega.arScore[i];
						minNum = mega.arHakbun[i];
					}
				}
				System.out.println(minNum +" "+min);
				
			}
			else if(choice == 4) {
				System.out.println("Number:");
				int input = scan.nextInt();
				int check = 0;
				for(int i=0;i<mega.arHakbun.length;i++){
					if(mega.arHakbun[i]==input){
						System.out.println(mega.arScore[i]);
						check = 1;
					}
				}
				if(check==0){
					System.out.println("Not exists number");
				}
			}
			else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}


	}

}
