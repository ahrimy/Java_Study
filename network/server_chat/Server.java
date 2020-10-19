package server_chat;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	
	public static ExecutorService threadPool = null;
	public static Vector<ServerClient> clientList = new Vector<>();
	ServerSocket serverSocket;
		
	public void startServer(String ip, int port) {
		try {			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip, port));
			String msg = "[��������]" + " " +  ip + " : " + port  + "\n";
			System.out.println(msg);		
			clientReceive();
		} catch (Exception e) {}
		
	}
	
	public void clientReceive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						clientList.add(new ServerClient(socket));
						System.out.println("[Ŭ���̾�Ʈ ����]" 
						+ socket.getRemoteSocketAddress() + ":  "
						+ Thread.currentThread().getName());
					} catch (Exception e) {}
				}
			}
		};
		
		threadPool = Executors.newCachedThreadPool();
		threadPool.submit(thread);
	}
	public void stopServer() {
		try {
			Iterator<ServerClient> iterator = clientList.iterator();
			while (iterator.hasNext()) {
				ServerClient client = iterator.next();
				System.out.println(iterator);
				System.out.println(client);
				client.send("���� ����\n");
			}
			while (iterator.hasNext()) {
				ServerClient client = iterator.next();
				client.clientSocket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (threadPool != null && !threadPool.isShutdown()) {
				threadPool.shutdown();
			}

		} catch (Exception e) {}
	}
	
	
	
}
