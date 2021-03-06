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

		// 漁 撲纂
		int temp = wallCount;
		while (temp != 0) {
			int rX = ran.nextInt(SIZE);
			int rY = ran.nextInt(SIZE);

			if (map[rY][rX] == 0) {
				map[rY][rX] = WALL;
				temp = temp - 1;
			}
		}
		// 議葛攪 寡纂
		while (true) {
			pX = ran.nextInt(SIZE);
			pY = ran.nextInt(SIZE);

			if (map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		// ァ驕 撲纂
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
		// 啪歜 衛濛
		while (true) {

			// 啪歜�飛� 轎溘
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("            Crazy Arcade");
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("Ⅹ 撲纂陛棟 ァ驕 偃熱\t " + bombMaxCount + "EA");
			System.out.println("Ⅹ 陴嬴氈朝 ァ驕 偃熱\t " + bombCount + "EA");
			System.out.println("Ⅹ 陴嬴氈朝 漁給 偃熱\t " + wallCount + "EA");
			System.out.println("Ⅹ �僱磈� 嬴檜蠱 偃熱\t " + itemCount + "EA");
			// ァ驕 轎溘
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("Ⅹ 撲纂脹 ァ驕曖 嬪纂");
			for (int i = 0; i < bombCount; i++) {
				System.out.println("[" + (i + 1) + "] " + bombY[i] + " : " + bombX[i]);
			}
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			wallCount = 0;
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == WALL) {
						wallCount = wallCount + 1;
						System.out.print("漁 ");
					} else if (map[i][j] == PLAYER) {
						System.out.print("褡 ");
					} else if (map[i][j] == BOMB) {
						System.out.print("ァ ");
					} else if (map[i][j] == ITEM) {
						System.out.print("嬴 ");
					} else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}

			if (playerDead) {
				System.out.println("[詭撮雖]議葛攪陛 ァ驕縑 蜃嬴 避歷蝗棲棻. 啪歜擊 謙猿м棲棻.");
				break;
			}

			// 檜翕 殮溘嫡晦
			System.out.print("鼻(1)ж(2)謝(3)辦(4)ァ驕撲纂(5)ァだ(6) 殮溘 : ");
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

				// 蕨諼籀葬
				if (SIZE <= tempY || tempY < 0)
					continue;
				if (SIZE <= tempX || tempX < 0)
					continue;
				if (map[tempY][tempX] == WALL)
					continue;
				if (map[tempY][tempX] == BOMB)
					continue;

				// 嬴檜蠱 �僱�
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

				// 議葛攪 嬪纂 檜翕
				if (map[pY][pX] == 2) {
					map[pY][pX] = 0;
				}
				pY = tempY;
				pX = tempX;
				map[pY][pX] = PLAYER;
			} else if (move == 5) {
				// 蕨諼籀葬
				if (bombMaxCount <= bombCount) {
					System.out.println("[詭撮雖]渦檜鼻 ァ驕擊 撲纂й 熱 橈蝗棲棻.");
					continue;
				}
				if (map[pY][pX] != 2 && map[pY][pX] != 0) {
					System.out.println("[詭撮雖]п渡 嬪纂縑朝 ァ驕擊 撲纂й 熱 橈蝗棲棻.");
					continue;
				}
				bombX[bombCount] = pX;
				bombY[bombCount] = pY;
				map[bombY[bombCount]][bombX[bombCount]] = BOMB;
				bombCount = bombCount + 1;
			} else if (move == 6) {
				// 蕨諼籀葬
				if (bombCount <= 0) {
					System.out.println("[詭撮雖]ァだй ァ驕檜 橈蝗棲棻.");
					continue;
				}
				int xx = bombX[0];
				int yy = bombY[0];
				for (int i = -1; i <= 1; i++) {
					if (0 <= xx + i && xx + i < SIZE) {
						if (map[yy][xx + i] == PLAYER)
							playerDead = true;
						// 漁橾陽縑虜 攪雖紫煙
						if (map[yy][xx + i] == WALL) {
							// 50Щ煎曖 �捕�煎 望(0) 傳朝 嬴檜蠱(4)檜 儅撩
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
				// ⑷營 ァだ嬪纂 蟾晦��
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
