package client_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private Socket socket;
	String ip = "127.0.0.1";
	int port = 19876;

	ClientPanel clientPanel;

	public void setClientPanel(ClientPanel panel) {
		clientPanel = panel;
	}



	public Socket getSocket() {
		return socket;
	}



	public void setSocket(Socket socket) {
		this.socket = socket;
	}



	public void startClient(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			if (socket!=null) {
				dataInputStream = new DataInputStream(socket.getInputStream());
				dataOutputStream = new DataOutputStream(socket.getOutputStream());
				receive();
			}
		} catch (Exception e) {
		}
	}

	public void receive() {
		new Thread(new Runnable() {
			boolean isThread = true;

			@Override
			public void run() {
				while (isThread) {
					try {
						String recvData = dataInputStream.readUTF();
						System.out.println(recvData);
						String data = clientPanel.textArea.getText();
						data = data + recvData;
						clientPanel.textArea.setText(data);
						if (recvData.equals("서버 종료\n")) {
							stopClient();
							clientPanel.connBtn.setText("접속하기");
						}
					} catch (Exception e) {
						stopClient();
						break;
					}
				}
			}
		}).start();

	}

	public void send(String message) {
		new Thread(new Runnable() {
			boolean isThread = true;

			@Override
			public void run() {
				try {
					dataOutputStream.writeUTF(message);
				} catch (Exception e) {
					stopClient();
				}
			}
		}).start();
	}

	public void stopClient() {
		try {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {

		}
	}
}
