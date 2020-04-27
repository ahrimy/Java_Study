package java4_17;

import java.util.Random;
import java.util.Scanner;

public class FileEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[][] map = new int[10][10];
		int[][] snake = new int[8][2];
		int sLength = 4;
		//set the location of snake
		for(int i=0;i<sLength;i++){
			snake[i][0] = i+3; //snake location Y
			snake[i][1] = 3;   //snake location X
		}
		int headY = snake[0][0];
		int headX = snake[0][1];
		int tailY = snake[sLength-1][0];
		int tailX = snake[sLength-1][1];
		//set item
		for (int i=0;i<4;i++){
			int rY = ran.nextInt(10);
			int rX = ran.nextInt(10);
			if(map[rY][rX]==0){
				map[rY][rX] = -1;
			}else{
				i--;
			}
		}
		while(true){
			for(int i=0;i<sLength;i++){
				map[snake[i][0]][snake[i][1]] = i+1;
			}
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if(map[i][j]==-1){
						System.out.print("*");
					}else{
						System.out.print(map[i][j]);
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println(headX +" , "+headY);
			System.out.print("[Left:4 Right:6 Up:8 Down:2] Enter: ");
			int input = scan.nextInt();
			if(input==4){
				if(headX>0){//not on the edge
					headX -= 1;
					if(map[headY][headX]==0){//normal move
						map[snake[sLength-1][0]][snake[sLength-1][1]] = 0;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					}else if(map[headY][headX]==-1){//item, plus length
						sLength++;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;	
					}else if(map[headY][headX]==2){
						System.out.println("Cannot go");
					}else if(map[headY][headX]>2&&map[headY][headX]<=sLength){
						System.out.println("Crush yourself");
						break;
					}else{
						System.out.println("Error"+map[headY][headX]);
					}
					
				}else{
					System.out.println("Your on the edge");
				}
			}else if(input==6){
				if(headX<9){//not on the edge
					headX += 1;
					if(map[headY][headX]==0){//normal move
						map[snake[sLength-1][0]][snake[sLength-1][1]] = 0;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					}else if(map[headY][headX]==-1){//item, plus length
						sLength++;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;	
						
					}else if(map[headY][headX]==2){
						System.out.println("Cannot go");
					}else if(map[headY][headX]>2&&map[headY][headX]<=sLength){
						System.out.println("Crush yourself");
						break;
					}else{
						System.out.println("Error"+map[headY][headX]);
					}
					
				}else{
					System.out.println("Your on the edge");
				}
			}else if(input==8){
				if(headY>0){//not on the edge
					headY -= 1;
					if(map[headY][headX]==0){//normal move
						map[snake[sLength-1][0]][snake[sLength-1][1]] = 0;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
							
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					}else if(map[headY][headX]==-1){//item, plus length
						sLength++;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;	
					}else if(map[headY][headX]==2){
						System.out.println("Cannot go");
					}else if(map[headY][headX]>2&&map[headY][headX]<=sLength){
						System.out.println("Crush yourself");
						break;
					}else{
						System.out.println("Error"+map[headY][headX]);
					}
					
				}else{
					System.out.println("Your on the edge");
				}
			}else if(input==2){
				if(headY<9){//not on the edge
					headY += 1;
					if(map[headY][headX]==0){//normal move
						map[snake[sLength-1][0]][snake[sLength-1][1]] = 0;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					}else if(map[headY][headX]==-1){//item, plus length
						sLength++;
						for(int i=sLength-1;i>0;i--){
							snake[i][0] = snake[i-1][0];
							snake[i][1] = snake[i-1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;	
					}else if(map[headY][headX]==2){
						System.out.println("Cannot go");
					}else if(map[headY][headX]>2&&map[headY][headX]<=sLength){
						System.out.println("Crush yourself");
						break;
					}else{
						System.out.println("Error"+map[headY][headX]);
					}
					
				}else{
					System.out.println("Your on the edge");
				}
			}else{
				
			}
		}
		
		

	}

}
