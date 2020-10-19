package client_chat;

import javax.swing.JFrame;

public class _ClientMain {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 200);
		frame.setTitle("Ã¤ÆÃ");
		Client client = new Client();
		ClientPanel panel = new ClientPanel();
		client.setClientPanel(panel);
		panel.setClient(client);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
