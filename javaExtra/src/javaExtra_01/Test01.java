package javaExtra_01;

import java.util.Scanner;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int size = 8;
		int map[][] = new int[size][size];
		int order[][] = new int[40][2];
		int inputY = 0;
		int inputX = 0;

		for (int i = 0; i < 40; i++) {
			inputY = ran.nextInt(size);
			inputX = ran.nextInt(size);
			if (map[inputY][inputX] == 0) {
				map[inputY][inputX] = 9;
			} else {
				i--;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (map[i][j] == 0) {
					System.out.print(" бр");
				} else {
					System.out.print(" бс");
				}

			}
			System.out.println();
		}

		System.out.println("Enter the location Y,X");
		inputY = scan.nextInt();
		inputX = scan.nextInt();
		int count = 0;
		int check = 0;
		int index = 0;
		// y-1 x-1 y-1 x y-1 x+1
		// y x-1 y x y x+1
		// y+1 x-1 y+1 x y+1 x+1
		int y = inputY;
		int x = inputX;
		while (true) {

			check = 0;
			// y-1 x-1 y-1 x y-1 x+1
			// top row
			if (y > 0) {
				if (map[y - 1][x] == 0) {
					map[y - 1][x] = 1;
					check = 1;
				} else if (map[y - 1][x] == 1) {
					if (map[y][x] == 2) {
						order[index][0] = y;
						order[index][1] = x;
						y = y - 1;
						index++;
						continue;
					}
				}
				// most left column
				if (x > 0) {
					if (map[y - 1][x - 1] == 0) {
						map[y - 1][x - 1] = 1;
						check = 1;
					} else if (map[y - 1][x - 1] == 1) {
						if (map[y][x] == 2) {
							order[index][0] = y;
							order[index][1] = x;
							y = y - 1;
							x = x - 1;
							index++;
							continue;
						}
					}
				}
				// most right column
				if (x < 7) {
					if (map[y - 1][x + 1] == 0) {
						map[y - 1][x + 1] = 1;
						check = 1;
					} else if (map[y - 1][x + 1] == 1) {
						if (map[y][x] == 2) {
							order[index][0] = y;
							order[index][1] = x;
							y = y - 1;
							x = x + 1;
							index++;
							continue;
						}
					}
				}
			}
			// y+1 x-1 y+1 x y+1 x+1
			// last row
			if (y < 7) {
				if (map[y + 1][x] == 0) {
					map[y + 1][x] = 1;
					check = 1;
				} else if (map[y + 1][x] == 1) {
					if (map[y][x] == 2) {
						order[index][0] = y;
						order[index][1] = x;
						y = y + 1;
						index++;
						continue;
					}
				}
				// most left column
				if (x > 0) {
					if (map[y + 1][x - 1] == 0) {
						map[y + 1][x - 1] = 1;
						check = 1;
					} else if (map[y + 1][x - 1] == 1) {
						if (map[y][x] == 2) {
							order[index][0] = y;
							order[index][1] = x;
							y = y + 1;
							x = x - 1;
							index++;
							continue;
						}
					}
				}
				// most right column
				if (x < 7) {
					if (map[y + 1][x + 1] == 0) {
						map[y + 1][x + 1] = 1;
						check = 1;
					} else if (map[y + 1][x + 1] == 1) {
						if (map[y][x] == 2) {
							order[index][0] = y;
							order[index][1] = x;
							y = y + 1;
							x = x + 1;
							index++;
							continue;
						}
					}
				}
			}
			// y x-1 y x y x+1
			// most left column
			if (x > 0) {
				if (map[y][x - 1] == 0) {
					map[y][x - 1] = 1;
					check = 1;
				} else if (map[y][x - 1] == 1) {
					if (map[y][x] == 2) {
						order[index][0] = y;
						order[index][1] = x;
						x = x - 1;
						index++;
						continue;
					}
				}
			}
			// most right column
			if (x < 7) {
				if (map[y][x + 1] == 0) {
					map[y][x + 1] = 1;
					check = 1;
				} else if (map[y][x + 1] == 1) {
					if (map[y][x] == 2) {
						order[index][0] = y;
						order[index][1] = x;
						x = x + 1;
						index++;
						continue;
					}
				}

			}
			if (check == 1) {
				map[y][x] = 2;
			} else if (check == 0) {
				if (map[y][x] == 1) {
					map[y][x] = 2;
				} else if (map[y][x] == 2) {
					map[y][x] = 3;
					if (index > 0) {
						index--;
						y = order[index][0];
						x = order[index][1];
						
						count++;
					} else {
						count++;
						break;
					}
				}
			}

		}
		System.out.println();
		
		int cnt = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(" " + map[i][j]);
				if(map[i][j]==3){
					cnt++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Count : "+count);
		System.out.println("Check : "+cnt);

	}

}
