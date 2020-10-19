package socket.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	
	Server(){
		try{
			serverSocket = new ServerSocket(9876);
			System.out.println("���� ����");
			
			clientSocket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			String sendData= "�������� ������ �޻���";
			dataOutputStream.writeUTF(sendData);
			String recvData = dataInputStream.readUTF();
			System.out.println("���� : "+recvData);
		}catch(Exception e){
			
		}finally{
			try{
				serverSocket.close();
				clientSocket.close();
				dataInputStream.close();
				dataOutputStream.close();
			}catch(Exception e){}
		}
	}
}
