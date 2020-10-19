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
			System.out.println("���� �õ�");
			clientSocket = new Socket("127.0.0.1",9876);
			
			System.out.println("���� �Ϸ�");
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			String sendData = "Ŭ���̾�Ʈ���� ������ �޼���";
			dataOutputStream.writeUTF(sendData);
			String recvData = dataInputStream.readUTF();
			System.out.println("���� : "+recvData);
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
