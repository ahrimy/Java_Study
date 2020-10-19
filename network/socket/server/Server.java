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
			System.out.println("서버 생성");
			
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트 소켓 연결");
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			String sendData= "서버에서 보내는 메새지";
			dataOutputStream.writeUTF(sendData);
			String recvData = dataInputStream.readUTF();
			System.out.println("상대방 : "+recvData);
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
