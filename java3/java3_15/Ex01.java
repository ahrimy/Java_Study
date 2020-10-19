package java3_15;

import java.util.Scanner;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int[][] map = new int[7][7];
		int inputY = 3;
		int inputX = 3;
		// player start location
		map[inputX][inputY] = 1;
		// install wall
		for (int i = 0; i < 5; i++) {
			inputY = ran.nextInt(7);
			inputX = ran.nextInt(7);
			while (map[inputY][inputX] != 0) {
				inputY = ran.nextInt(7);
				inputX = ran.nextInt(7);
			}
			map[inputY][inputX] = 3;
		}
		// install ball
		for (int i = 0; i < 3; i++) {
			inputY = ran.nextInt(5) + 1;
			inputX = ran.nextInt(5) + 1;
			while (map[inputY][inputX] != 0) {
				inputY = ran.nextInt(7);
				inputX = ran.nextInt(7);
			}
			map[inputY][inputX] = 2;
		}
		// install goal
		for (int i = 0; i < 3; i++) {
			inputY = ran.nextInt(7);
			inputX = ran.nextInt(7);
			while (map[inputY][inputX] != 0) {
				inputY = ran.nextInt(7);
				inputX = ran.nextInt(7);
			}
			map[inputY][inputX] = 4;
		}
		int pY = 3;
		int pX = 3;
		int goalCount = 0;
		int goalLo = 0;
		while (true) {
			if (goalCount == 3) {
				break;
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (map[i][j] == 0) {
						System.out.print("I ");
					} else if (map[i][j] == 1) {
						System.out.print("P ");
					} else if (map[i][j] == 2) {
						System.out.print("B ");
					} else if (map[i][j] == 3) {
						System.out.print("W ");
					} else if (map[i][j] == 4) {
						System.out.print("G ");
					} else if (map[i][j] == 5) {
						System.out.print("D ");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Compelete Goal:" + goalCount);
			System.out.println();
			System.out.print("UP[8] DOWN[2] LEFT[4] RIGHT[6]:");
			int input = scan.nextInt();
			if (input == 8) {
				if (pY - 1 < 0) {
					System.out.println("Can't go up");
				} else {
					if (map[pY - 1][pX] == 3) {
						System.out.println("Can't go up because of the Wall");
					} else if (map[pY - 1][pX] == 2) {
						if (pY - 2 < 0) {
							System.out.println("Can't go up");
						} else if (map[pY - 2][pX] == 2) {
							System.out.println("Can't go up because of the Ball");
						} else if (map[pY - 2][pX] == 3) {
							System.out.println("Can't go up because of the Wall");
						}  else {
							if (goalLo == 1) {
								map[pY][pX] = 4;
								goalLo = 0;
							} else if (goalLo == 2) {
								map[pY][pX] = 5;
								goalLo = 0;
							} else {
								map[pY][pX] = 0;
							}
							pY -= 1;
							map[pY][pX] = 1;
							if (map[pY - 1][pX] == 4) {
								System.out.println("Arrived at the Goal");
								goalCount++;
								map[pY - 1][pX] = 5;
							} else {
								map[pY - 1][pX] = 2;
							}
						}
					} else {
						if (goalLo == 1) {
							map[pY][pX] = 4;
							goalLo = 0;
						} else if (goalLo == 2) {
							map[pY][pX] = 5;
							goalLo = 0;
						} else {
							map[pY][pX] = 0;
						}
						if (map[pY - 1][pX] == 5) {
							goalLo = 2;
						} else if (map[pY - 1][pX] == 4) {
							goalLo = 1;
						}
						pY -= 1;
						map[pY][pX] = 1;
					}
				}
			} else if (input == 2) {
				if (pY + 1 >= 7) {
					System.out.println("Can't go down");
				} else {
					if (map[pY + 1][pX] == 3) {
						System.out.println("Can't go down because of the Wall");
					} else if (map[pY + 1][pX] == 2) {
						if (pY + 2 >= 7) {
							System.out.println("Can't go down");
						} else if (map[pY + 2][pX] == 3) {
							System.out.println("Can't go down because of the Wall");
						} else if (map[pY + 2][pX] == 2) {
							System.out.println("Can't go down because of the Ball");
						} else {
							if (goalLo == 1) {
								map[pY][pX] = 4;
								goalLo = 0;
							} else if (goalLo == 2) {
								map[pY][pX] = 5;
								goalLo = 0;
							} else {
								map[pY][pX] = 0;
							}
							pY += 1;
							map[pY][pX] = 1;
							if (map[pY + 1][pX] == 4) {
								System.out.println("Arrived at the Goal");
								goalCount++;
								map[pY + 1][pX] = 5;
							} else {
								map[pY + 1][pX] = 2;
							}
						}
					} else {
						if (goalLo == 1) {
							map[pY][pX] = 4;
							goalLo = 0;
						} else if (goalLo == 2) {
							map[pY][pX] = 5;
							goalLo = 0;
						} else {
							map[pY][pX] = 0;
						}
						if (map[pY + 1][pX] == 5) {
							goalLo = 2;
						} else if (map[pY + 1][pX] == 4) {
							goalLo = 1;
						}
						pY += 1;
						map[pY][pX] = 1;

					}
				}

			} else if (input == 4) {
				if (pX - 1 < 0) {
					System.out.println("Can't go left");
				} else {
					if (map[pY][pX - 1] == 3) {
						System.out.println("Can't go left because of the Wall");
					} else if (map[pY][pX - 1] == 2) {
						if (pX - 2 < 0) {
							System.out.println("Can't go left");
						} else if (map[pY][pX-2] == 2) {
							System.out.println("Can't go left because of the Ball");
						} else if (map[pY][pX-2] == 3) {
							System.out.println("Can't go left because of the Wall");
						} else {
							if (goalLo == 1) {
								map[pY][pX] = 4;
								goalLo = 0;
							} else if (goalLo == 2) {
								map[pY][pX] = 5;
								goalLo = 0;
							} else {
								map[pY][pX] = 0;
							}
							pX -= 1;
							map[pY][pX] = 1;
							if (map[pY][pX - 1] == 4) {
								System.out.println("Arrived at the Goal");
								goalCount++;
								map[pY][pX - 1] = 5;
							} else {
								map[pY][pX - 1] = 2;
							}
						}
					} else {
						if (goalLo == 1) {
							map[pY][pX] = 4;
							goalLo = 0;
						} else if (goalLo == 2) {
							map[pY][pX] = 5;
							goalLo = 0;
						} else {
							map[pY][pX] = 0;
						}
						if (map[pY][pX - 1] == 4) {

							goalLo = 1;
						} else if (map[pY][pX - 1] == 5) {

							goalLo = 2;
						}
						pX -= 1;
						map[pY][pX] = 1;
					}
				}
			} else if (input == 6) {
				if (pX + 1 >= 7) {
					System.out.println("Can't go right");
				} else {
					if (map[pY][pX + 1] == 3) {
						System.out.println("Can't go right because of the Wall");
					} else if (map[pY][pX + 1] == 2) {
						if (pX + 2 >= 7) {
							System.out.println("Can't go right");
						} else if (map[pY][pX+2] == 2) {
							System.out.println("Can't go right because of the Ball");
						} else if (map[pY][pX+2] == 3) {
							System.out.println("Can't go right because of the Wall");
						} else {
							if (goalLo == 1) {
								map[pY][pX] = 4;
								goalLo = 0;
							} else if (goalLo == 2) {
								map[pY][pX] = 5;
								goalLo = 0;
							} else {
								map[pY][pX] = 0;
							}
							pX += 1;
							map[pY][pX] = 1;
							if (map[pY][pX + 1] == 4) {
								System.out.println("Arrived at the Goal");
								goalCount++;
								map[pY][pX + 1] = 5;
							} else {
								map[pY][pX + 1] = 2;
							}
						}
					} else {
						if (goalLo == 1) {
							map[pY][pX] = 4;
							goalLo = 0;
						} else if (goalLo == 2) {
							map[pY][pX] = 5;
							goalLo = 0;
						} else {
							map[pY][pX] = 0;
						}
						if (map[pY][pX + 1] == 4) {
							goalLo = 1;
						} else if (map[pY][pX + 1] == 5) {

							goalLo = 2;
						}
						pX += 1;
						map[pY][pX] = 1;
					}
				}
			} else {
				System.out.println("Wrong input");
			}

		}
		System.out.println("Game End");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (map[i][j] == 0) {
					System.out.print("I ");
				} else if (map[i][j] == 1) {
					System.out.print("P ");
				} else if (map[i][j] == 2) {
					System.out.print("B ");
				} else if (map[i][j] == 3) {
					System.out.print("W ");
				} else if (map[i][j] == 4) {
					System.out.print("G ");
				} else if (map[i][j] == 5) {
					System.out.print("D ");
				}
			}
			System.out.println();
		}

	}

}
