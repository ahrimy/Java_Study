package server;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import client.Client;


public class Server {
	public static ExecutorService threadPool = null;
	public static Vector<Client> clientList = new Vector<>();
	
	ServerSocket serverSocket;
	String ip = "127.0.0.1";
	int port = 19876;
	
	Server(){
		startServer(ip,port);
	}
	public void startServer(String ip, int port){
		try{
			this.ip = ip;
			this.port = port;
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip,port));
			String msg = "";
			msg+="[��������]"+" "+ip+" : "+port+"\n";
			System.out.println(msg);
		}catch(Exception e){}
		
		Runnable thread = new Runnable(){
			@Override
			public void run(){
				while(true){
					try {
						Socket socket = serverSocket.accept();
						clientList.add(new Client(socket));
						System.out.println("[Ŭ���̾�Ʈ ����]"+socket.getRemoteSocketAddress()+": "+Thread.currentThread().getName());
					}catch(Exception e){}
				}
			}
			
		};
		threadPool = Executors.newCachedThreadPool();
		threadPool.submit(thread);
	}
}
