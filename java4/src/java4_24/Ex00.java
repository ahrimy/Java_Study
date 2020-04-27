package java4_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String fileName = "maker.txt";

		while (true) {
			int[][] map = new int[7][7];
			String data = "";

			int inputY = 3;
			int inputX = 3;
			int wallMax = 5;
			int ballMax = 3;
			int goalMax = 3;
			// player start location
			map[inputX][inputY] = 1;

			System.out.println("[1]Make [2]Play [3]End");
			int choice = scan.nextInt();
			if (choice == 1) {
				int wallC = 0;
				int ballC = 0;
				int goalC = 0;
				while (true) {
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
					System.out.println("Wall[1],Ball[2]Goal[3]End[0]:");
					int input = scan.nextInt();
					if (input == 1) {
						if (wallC < wallMax) {
							// install wall
							System.out.println("Wall Location Y,X:");
							inputY = scan.nextInt();
							inputX = scan.nextInt();
							if (inputX > -1 && inputY > -1 && inputX < 7 && inputY < 7) {
								while (map[inputY][inputX] != 0) {
									System.out.println("Enter again Y,X:");
									inputY = scan.nextInt();
									inputX = scan.nextInt();
								}
								map[inputY][inputX] = 3;
								wallC++;
							} else {
								System.out.println("Out of map");
							}
						} else {
							System.out.println("No more wall");
						}

					} else if (input == 2) {
						if(ballC<ballMax){
						// install ball

						System.out.println("Ball Location Y,X:");
						inputY = scan.nextInt();
						inputX = scan.nextInt();

						if (inputX > -1 && inputY > -1 && inputX < 7 && inputY < 7) {
							while (map[inputY][inputX] != 0) {
								System.out.println("Enter again Y,X:");
								inputY = scan.nextInt();
								inputX = scan.nextInt();
							}
							map[inputY][inputX] = 2;
							ballC++;
						} else {
							System.out.println("Out of map");
						}
						}else{
							System.out.println("No more ball");
						}

					} else if (input == 3) {
						if(goalC<goalMax){
						// install goal

						System.out.println("Goal Location Y,X:");
						inputY = scan.nextInt();
						inputX = scan.nextInt();

						if (inputX > -1 && inputY > -1 && inputX < 7 && inputY < 7) {
							while (map[inputY][inputX] != 0) {
								System.out.println("Enter again Y,X:");
								inputY = scan.nextInt();
								inputX = scan.nextInt();
							}
							map[inputY][inputX] = 4;
							goalC++;
						} else {
							System.out.println("Out of map");
						}
						}else{
							System.out.println("No more goal");
						}
					} else if (input == 0) {
						System.out.println("Save the map [wall]"+wallC+"[ball]"+ballC+"[goal]"+goalC);
						data += "Wall/" + wallC + "\n";
						data += "Ball/" + ballC + "\n";
						data += "Goal/" + goalC + "\n";
						for (int i = 0; i < 7; i++) {
							for (int j = 0; j < 7; j++) {
								data += map[i][j] + " ";
							}
							data = data.substring(0, data.length() - 1);
							data += "\n";
						}
						data = data.substring(0, data.length() - 1);

						FileWriter fw = null;
						try {
							fw = new FileWriter(fileName);
							fw.write(data);
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							if (fw != null) {
								try {
									fw.close();
								} catch (IOException e) {
								}
							}
						}

						break;
					}

					if (wallC == wallMax && ballC == ballMax && goalC == goalMax) {
						System.out.println("Save the map");
						data += "Wall/" + wallC + "\n";
						data += "Ball/" + ballC + "\n";
						data += "Goal/" + goalC + "\n";
						for (int i = 0; i < 7; i++) {
							for (int j = 0; j < 7; j++) {
								data += map[i][j] + " ";
							}
							data = data.substring(0, data.length() - 1);
							data += "\n";
						}
						data = data.substring(0, data.length() - 1);

						FileWriter fw = null;
						try {
							fw = new FileWriter(fileName);
							fw.write(data);
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							if (fw != null) {
								try {
									fw.close();
								} catch (IOException e) {
								}
							}
						}

						break;
					}
				}
			} else if (choice == 2) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while (true) {
							String line = br.readLine();
							if (line == null) {
								break;
							}

							data += line;
							data += "\n";
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (fr != null) {
							try {
								fr.close();
							} catch (IOException e) {
							}
						}
						if (br != null) {
							try {
								br.close();
							} catch (IOException e) {
							}
						}
					}
					data = data.substring(0, data.length() - 1);
					String[] temp = data.split("\n");
					int size = temp.length;
					String[] wallInfo = temp[0].split("/");
					wallMax = Integer.parseInt(wallInfo[1]);

					String[] ballInfo = temp[1].split("/");
					ballMax = Integer.parseInt(ballInfo[1]);

					String[] goalInfo = temp[2].split("/");
					goalMax = Integer.parseInt(goalInfo[1]);

					for (int i = 3; i < temp.length; i++) {
						String info[] = temp[i].split(" ");
						for (int j = 0; j < info.length; j++) {
							map[i - 3][j] = Integer.parseInt(info[j]);
						}

					}

				} else {
					// install wall
					for (int i = 0; i < wallMax; i++) {
						inputY = ran.nextInt(7);
						inputX = ran.nextInt(7);
						while (map[inputY][inputX] != 0) {
							inputY = ran.nextInt(7);
							inputX = ran.nextInt(7);
						}
						map[inputY][inputX] = 3;
					}
					// install ball
					for (int i = 0; i < ballMax; i++) {
						inputY = ran.nextInt(5) + 1;
						inputX = ran.nextInt(5) + 1;
						while (map[inputY][inputX] != 0) {
							inputY = ran.nextInt(5) + 1;
							inputX = ran.nextInt(5) + 1;
						}
						map[inputY][inputX] = 2;
					}
					// install goal
					for (int i = 0; i < goalMax; i++) {
						inputY = ran.nextInt(7);
						inputX = ran.nextInt(7);
						while (map[inputY][inputX] != 0) {
							inputY = ran.nextInt(7);
							inputX = ran.nextInt(7);
						}
						map[inputY][inputX] = 4;
					}
				}
				int pY = 3;
				int pX = 3;
				int goalCount = 0;
				int goalLo = 0;
				while (true) {
					if (goalCount == goalMax) {
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
	}

}
