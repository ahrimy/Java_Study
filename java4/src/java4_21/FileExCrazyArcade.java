package java4_21;

import java.util.Random;
import java.util.Scanner;

public class FileExCrazyArcade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 7;
		final int PLAYER = 2;
		final int WALL = 3;
		final int ITEM = 1;
		final int BOMB = 4;
		int map[][] = new int[SIZE][SIZE];
		// player location set
		int pX = 3;
		int pY = 3;
		int bombCounts = 5;// Total count of bombs
		int bombSet = 0;// Bomb on the map
		int[][] bombLo = new int[20][2];
		int wallSet = 10;
		map[pY][pX] = PLAYER;
		// set the wall(10walls)
		for (int i = 0; i < wallSet; i++) {
			int rX = ran.nextInt(7);
			int rY = ran.nextInt(7);
			if (map[rY][rX] == 0) {
				map[rY][rX] = WALL;
			} else {
				i--;
			}
		}
		int check = 0;
		while (wallSet>0) {
			System.out.println("Available BOMB:"+bombCounts);
			System.out.println("Set BOMB:"+bombSet);
			for(int i=0;i<bombSet;i++){
				System.out.println(((1+i)+" Bomb location:")+bombLo[i][0]+ " , "+bombLo[i][1]);
			}
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) {
						System.out.print(" P");
					} else if (map[i][j] == WALL) {
						System.out.print(" W");
					} else if (map[i][j] == ITEM) {
						System.out.print(" I");
					} else if (map[i][j] == BOMB) {
						System.out.print(" B");
					} else {
						System.out.print(" " + map[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println(pX + " , " + pY);
			System.out.print("[Left:4 Right:6 Up:8 Down:2][Set Bomb:0 Explode Bomb:9] Enter: ");
			int input = scan.nextInt();
			if (input == 4) {// left
				if (pX > 0) {// not on the edge
					if (map[pY][pX - 1] == 0) {// normal move
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[pY][--pX] = PLAYER;
					} else if (map[pY][pX - 1] == ITEM) {// item, Available bomb
															// plus
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[pY][--pX] = PLAYER;
						bombCounts++;
					} else if (map[pY][pX - 1] == WALL || map[pY][pX - 1] == BOMB) {
						System.out.println("Cannot go");
					} else {
						System.out.println("Error" + map[pY][pX - 1]);
					}
				} else {
					System.out.println("Your on the edge");
				}
			} else if (input == 6) {
				if (pX < 6) {// not on the edge
					if (map[pY][pX + 1] == 0) {// normal move
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[pY][++pX] = PLAYER;
					} else if (map[pY][pX + 1] == ITEM) {// item, Available bomb
															// plus
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[pY][++pX] = PLAYER;
						bombCounts++;
					} else if (map[pY][pX + 1] == WALL || map[pY][pX + 1] == BOMB) {
						System.out.println("Cannot go");
					} else {
						System.out.println("Error" + map[pY][pX + 1]);
					}
				} else {
					System.out.println("Your on the edge");
				}
			} else if (input == 8) {
				if (pY > 0) {// not on the edge
					if (map[pY - 1][pX] == 0) {// normal move
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[--pY][pX] = PLAYER;
					} else if (map[pY - 1][pX] == ITEM) {// item, Available bomb
															// plus
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[--pY][pX] = PLAYER;
						bombCounts++;
					} else if (map[pY - 1][pX] == WALL || map[pY - 1][pX] == BOMB) {
						System.out.println("Cannot go");
					} else {
						System.out.println("Error" + map[pY - 1][pX]);
					}
				} else {
					System.out.println("Your on the edge");
				}
			} else if (input == 2) {
				if (pY < 6) {// not on the edge
					if (map[pY + 1][pX] == 0) {// normal move
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[++pY][pX] = PLAYER;
					} else if (map[pY + 1][pX] == ITEM) {// item, Available bomb
															// plus
						if (check == 0) {
							map[pY][pX] = 0;
						} else {
							map[pY][pX] = BOMB;
							check = 0;
						}
						map[++pY][pX] = PLAYER;
						bombCounts++;
					} else if (map[pY + 1][pX] == WALL || map[pY - 1][pX] == BOMB) {
						System.out.println("Cannot go");
					} else {
						System.out.println("Error" + map[pY - 1][pX]);
					}
				} else {
					System.out.println("Your on the edge");
				}
			} else if (input == 0) {
				if(bombCounts>0){
				check = 1;
				bombLo[bombSet][0] = pY;
				bombLo[bombSet][1] = pX;
				bombCounts--;
				bombSet++;
				}else{
					System.out.println("Need bomb");
				}
			} else if (input == 9) {
				if (bombSet > 0) {
					// Up
					if (bombLo[0][0] > 0) {
						if (map[bombLo[0][0] - 1][bombLo[0][1]] == WALL) {
							int r = ran.nextInt(2);
							map[bombLo[0][0] - 1][bombLo[0][1]] = r;

							wallSet--;
						} else if (map[bombLo[0][0] - 1][bombLo[0][1]] == PLAYER) {
							System.out.println("Explode");
							break;
						}
					}
					// Down
					if (bombLo[0][0] < 6) {
						if (map[bombLo[0][0] + 1][bombLo[0][1]] == WALL) {
							int r = ran.nextInt(2);
							map[bombLo[0][0] + 1][bombLo[0][1]] = r;

							wallSet--;
						} else if (map[bombLo[0][0] + 1][bombLo[0][1]] == PLAYER) {
							System.out.println("Explode");
							break;
						}
					}
					// Left
					if (bombLo[0][1] > 0) {
						if (map[bombLo[0][0]][bombLo[0][1] - 1] == WALL) {
							int r = ran.nextInt(2);
							map[bombLo[0][0]][bombLo[0][1] - 1] = r;
							wallSet--;
						} else if (map[bombLo[0][0]][bombLo[0][1] - 1] == PLAYER) {
							System.out.println("Explode");
							break;
						}
					}
					// Right
					if (bombLo[0][1] < 6) {
						if (map[bombLo[0][0]][bombLo[0][1] + 1] == WALL) {
							int r = ran.nextInt(2);
							map[bombLo[0][0]][bombLo[0][1] + 1] = r;

							wallSet--;
						} else if (map[bombLo[0][0]][bombLo[0][1] + 1] == PLAYER) {
							System.out.println("Explode");
							break;
						}
					}
					map[bombLo[0][0]][bombLo[0][1]]=0;
					bombSet--;
					int temp[][] = new int[20][2];
					for(int i=0;i<bombSet;i++){
						temp[i] = bombLo[i+1];
					}
					bombLo = temp;
				}
				else{
					System.out.println("No bomb is on the map");
				}
			}
			if(wallSet==0){
				System.out.println("Finished the game");
			}
		}

	}

}
