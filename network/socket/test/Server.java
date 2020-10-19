package socket.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public void serverSetting() {
		try {
			// localhost, 10002
			serverSocket = new ServerSocket(10002); // ���ε�
			System.out.println("���� ����");
			clientSocket = serverSocket.accept(); // ���Ʈ.
			// ������ ���� �Ϸ� �� �κ�
			System.out.println("Ŭ���̾�Ʈ ���� ����");
		} catch (Exception e) {
		}
	}

	public void closeAll() {
		try {
			serverSocket.close();
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
		} catch (Exception e) {
		}
	}

	public void streamSetting() {
		try {
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
		}
	}

	public void dataRecv() {
		new Thread(new Runnable() {
			boolean isThread = true;

			@Override
			public void run() {
				while (isThread) {
					try {
						String recvData = dataInputStream.readUTF();

						if (recvData.equals("/quit"))
							isThread = false;
						else
							System.out.println("���� : " + recvData);

					} catch (Exception e) {
					}
				}
			}
		}).start();

	}

	public void dataSend() {
		new Thread(new Runnable() {
			Scanner in = new Scanner(System.in);
			boolean isThread = true;

			@Override
			public void run() {
				while (isThread) {
					try {
						String sendData = in.nextLine();
						if (sendData.equals("/quit")) {
							isThread = false;
						} else
							dataOutputStream.writeUTF(sendData);
					} catch (Exception e) {
					}
				}
			}
		}).start();

	}

	public Server() {
		serverSetting();
		streamSetting();
		dataRecv();
		dataSend();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
	}

}
