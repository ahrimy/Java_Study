package socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	
	public Client(){
		try{
			System.out.println("접속 시도");
			clientSocket = new Socket("127.0.0.1",9876);
			
			System.out.println("접속 완료");
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			String sendData = "클라이언트에서 보내는 메세지";
			dataOutputStream.writeUTF(sendData);
			String recvData = dataInputStream.readUTF();
			System.out.println("서버 : "+recvData);
		}catch(Exception e){
			
		}finally{
			try{
				clientSocket.close();
				dataInputStream.close();
				dataOutputStream.close();
			}catch(Exception e){}
		}
	}

}
