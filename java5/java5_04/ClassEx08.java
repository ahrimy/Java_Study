package java5_04;

import java.util.Scanner;

class Ex08 {
	int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
}

public class ClassEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();
		int player = 0;

		for (int i = 0; i < 9; i++) {
			if (e.game[i] == 2) {
				player = i;
			}
		}
		System.out.println("player: " + player);
		int input = 0;

		boolean run = true;
		while(run){
			for (int i = 0; i < 9; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println();
			System.out.print("Enter the number:");
			input = scan.nextInt();
			if(input==1){
				if(player-1>=0){
					if(e.game[player-1]==1){
						System.out.println("There is a wall");
						System.out.print("Crush(Enter 3)?:");
						input = scan.nextInt();
						if(input==3){
							e.game[player-1] = 0;
						}else{
							continue;
						}
					}
					e.game[player]=0;
					player -= 1;
					e.game[player]=2;
				}else{
					if(e.game[8]==1){
						System.out.println("There is a wall");
						System.out.print("Crush(Enter 3)?:");
						input = scan.nextInt();
						if(input==3){
							e.game[8] = 0;
						}else{
							continue;
						}
					}
					e.game[player]=0;
					player =8;
					e.game[player]=2;
				}
			}else if(input==2){
				if(player<8){
					if(e.game[player+1]==1){
						System.out.println("There is a wall");
						System.out.print("Crush(Enter 3)?:");
						input = scan.nextInt();
						if(input==3){
							e.game[player+1] = 0;
						}else{
							continue;
						}
					}
					e.game[player]=0;
					player += 1;
					e.game[player]=2;
				}else{
					if(e.game[0]==1){
						System.out.println("There is a wall");
						System.out.print("Crush(Enter 3)?:");
						input = scan.nextInt();
						if(input==3){
							e.game[0] = 0;
						}else{
							continue;
						}
					}
					e.game[player]=0;
					player  = 0;
					e.game[player]=2;
				}
			}else{
				System.out.println("게임 종료");
				run = false;
			}

		}
	}

}
