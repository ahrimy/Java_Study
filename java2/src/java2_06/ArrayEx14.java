package java2_06;
import java.util.Scanner;
public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] game = {0,0,2,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		int player = 0;
		
		for(int i=0;i<7;i++){
			if(game[i]==2){
				player=i;
			}
		}
		System.out.println("player: "+player);
		int input = 0;
		
		boolean run = true;
		while(run){
			for (int i = 0; i < 7; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.print("Enter the number:");
			input = scan.nextInt();
			if(input==1){
				if(player-1>=0){
					game[player]=0;
					player -= 1;
					game[player]=2;
				}else{
					System.out.println("왼쪽 끝");
				}
			}else if(input==2){
				if(player+1<7){
					game[player]=0;
					player += 1;
					game[player]=2;
				}else{
					System.out.println("오른쪽 끝");
				}
			}else{
				System.out.println("게임 종료");
				run = false;
			}

		}
	}

}
