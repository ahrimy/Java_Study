package java4_21;

import java.util.Random;
import java.util.Scanner;

public class FileExCrazyArcadeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 7;
		final int WALL = 3;
		final int PLAYER = 2;
		final int BOMB = 9;
		final int ITEM = 4;

		boolean playerDead = false;
		int bombMaxCount = 3;
		int bombCount = bombMaxCount;
		int wallCount = 20;
		int itemCount = 0;
		int pX = 0;
		int pY = 0;

		int[] bombX = new int[bombMaxCount];
		int[] bombY = new int[bombMaxCount];
		int[][] map = new int[SIZE][SIZE];

		// º® ¼³Ä¡
		int temp = wallCount;
		while (temp != 0) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);

			if (map[rY][rX] == 0) {
				map[rY][rX] = WALL;
				temp = temp - 1;
			}
		}
		// Ä³¸¯ÅÍ ¹èÄ¡
		while (true) {
			pX = ran.nextInt(SIZE);
			pY = ran.nextInt(SIZE);

			if (map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		// ÆøÅº ¼³Ä¡
		temp = 0;
		while (temp != 3) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);

			if (map[rY][rX] == 0) {
				map[rY][rX] = BOMB;
				bombX[temp] = rX;
				bombY[temp] = rY;
				temp = temp + 1;
			}
		}
		// °ÔÀÓ ½ÃÀÛ
		while (true) {

			// °ÔÀÓÈ­¸é Ãâ·Â
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.println("            Crazy Arcade");
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.println("¢Â ¼³Ä¡°¡´É ÆøÅº °³¼ö\t " + bombMaxCount + "EA");
			System.out.println("¢Â ³²¾ÆÀÖ´Â ÆøÅº °³¼ö\t " + bombCount + "EA");
			System.out.println("¢Â ³²¾ÆÀÖ´Â º®µ¹ °³¼ö\t " + wallCount + "EA");
			System.out.println("¢Â È¹µæÇÒ ¾ÆÀÌÅÛ °³¼ö\t " + itemCount + "EA");
			// ÆøÅº Ãâ·Â
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.println("¢Â ¼³Ä¡µÈ ÆøÅºÀÇ À§Ä¡");
			for (int i = 0; i < bombCount; i++) {
				System.out.println("[" + (i + 1) + "] " + bombY[i] + " : " + bombX[i]);
			}
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			wallCount = 0;
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == WALL) {
						wallCount = wallCount + 1;
						System.out.print("º® ");
					} else if (map[i][j] == PLAYER) {
						System.out.print("¿Ê ");
					} else if (map[i][j] == BOMB) {
						System.out.print("Æø ");
					} else if (map[i][j] == ITEM) {
						System.out.print("¾Æ ");
					} else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}

			if (playerDead) {
				System.out.println("[¸Þ¼¼Áö]Ä³¸¯ÅÍ°¡ ÆøÅº¿¡ ¸Â¾Æ Á×¾ú½À´Ï´Ù. °ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				break;
			}

			// ÀÌµ¿ ÀÔ·Â¹Þ±â
			System.out.print("»ó(1)ÇÏ(2)ÁÂ(3)¿ì(4)ÆøÅº¼³Ä¡(5)ÆøÆÄ(6) ÀÔ·Â : ");
			int move = scan.nextInt();

			if (move == 1 || move == 2 || move == 3 || move == 4) {
				int tempX = pX;
				int tempY = pY;

				if (move == 1) {
					tempY = tempY - 1;
				} else if (move == 2) {
					tempY = tempY + 1;
				} else if (move == 3) {
					tempX = tempX - 1;
				} else if (move == 4) {
					tempX = tempX + 1;
				}

				// ¿¹¿ÜÃ³¸®
				if (SIZE <= tempY || tempY < 0)
					continue;
				if (SIZE <= tempX || tempX < 0)
					continue;
				if (map[tempY][tempX] == WALL)
					continue;
				if (map[tempY][tempX] == BOMB)
					continue;

				// ¾ÆÀÌÅÛ È¹µæ
				if (map[tempY][tempX] == ITEM) {
					map[pY][pX] = 0;
					itemCount = itemCount - 1;

					int[] x = bombX;
					int[] y = bombY;

					bombX = new int[bombMaxCount + 1];
					bombY = new int[bombMaxCount + 1];

					for (int i = 0; i < bombMaxCount; i++) {
						bombX[i] = x[i];
						bombY[i] = y[i];
					}

					x = null;
					y = null;

					bombMaxCount = bombMaxCount + 1;
				}

				// Ä³¸¯ÅÍ À§Ä¡ ÀÌµ¿
				if (map[pY][pX] == 2) {
					map[pY][pX] = 0;
				}
				pY = tempY;
				pX = tempX;
				map[pY][pX] = PLAYER;
			} else if (move == 5) {
				// ¿¹¿ÜÃ³¸®
				if (bombMaxCount <= bombCount) {
					System.out.println("[¸Þ¼¼Áö]´õÀÌ»ó ÆøÅºÀ» ¼³Ä¡ÇÒ ¼ö ¾ø½À´Ï´Ù.");
					continue;
				}
				if (map[pY][pX] != 2 && map[pY][pX] != 0) {
					System.out.println("[¸Þ¼¼Áö]ÇØ´ç À§Ä¡¿¡´Â ÆøÅºÀ» ¼³Ä¡ÇÒ ¼ö ¾ø½À´Ï´Ù.");
					continue;
				}
				bombX[bombCount] = pX;
				bombY[bombCount] = pY;
				map[bombY[bombCount]][bombX[bombCount]] = BOMB;
				bombCount = bombCount + 1;
			} else if (move == 6) {
				// ¿¹¿ÜÃ³¸®
				if (bombCount <= 0) {
					System.out.println("[¸Þ¼¼Áö]ÆøÆÄÇÒ ÆøÅºÀÌ ¾ø½À´Ï´Ù.");
					continue;
				}
				int xx = bombX[0];
				int yy = bombY[0];
				for (int i = -1; i <= 1; i++) {
					if (0 <= xx + i && xx + i < SIZE) {
						if (map[yy][xx + i] == PLAYER)
							playerDead = true;
						// º®ÀÏ¶§¿¡¸¸ ÅÍÁöµµ·Ï
						if (map[yy][xx + i] == WALL) {
							// 50ÇÁ·ÎÀÇ È®·ü·Î ±æ(0) ¶Ç´Â ¾ÆÀÌÅÛ(4)ÀÌ »ý¼º
							if (ran.nextInt(2) == 0) {
								map[yy][xx + i] = 0;
							} else {
								map[yy][xx + i] = ITEM;
								itemCount = itemCount + 1;
							}
						}
					}
					if (0 <= yy + i && yy + i < SIZE) {
						if (map[yy + i][xx] == PLAYER)
							playerDead = true;
						if (map[yy + i][xx] == WALL) {
							if (ran.nextInt(2) == 0) {
								map[yy + i][xx] = 0;
							} else {
								map[yy + i][xx] = ITEM;
								itemCount = itemCount + 1;
							}
						}
					}
				}
				// ÇöÀç ÆøÆÄÀ§Ä¡ ÃÊ±âÈ­
				map[yy][xx] = 0;
				for (int i = 0; i < bombMaxCount - 1; i++) {
					bombX[i] = bombX[i + 1];
					bombY[i] = bombY[i + 1];
				}
				bombCount = bombCount - 1;
			}

		}

	}

}
