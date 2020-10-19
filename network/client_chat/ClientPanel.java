package client_chat;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ClientPanel extends JPanel implements ActionListener {
	Client client;
	JTextArea textArea = new JTextArea();
	JButton inputBtn = new JButton();
	JButton connBtn = new JButton();
	TextField input = new TextField();
	TextField userIp;
	TextField userName;
	TextField userPort;
	int port = 9876;

	public ClientPanel() {
		setLayout(null);
		Font font = new Font("", Font.PLAIN, 20);

		userName = new TextField();
		userName.setBounds(0, 0, 160, 30);
		userName.setFont(font);
		add(userName);
		userName.setText("닉네임");
		userIp = new TextField("127.0.0.1");
		userIp.setBounds(180, 0, 190, 30);
		userIp.setFont(font);
		add(userIp);
		userPort = new TextField("9876");
		userPort.setBounds(390, 0, 80, 30);
		userPort.setFont(font);
		add(userPort);
		// ta.setBackground(Color.lightGray);
		textArea.setBounds(0, 30, 500, 390);
		textArea.setForeground(Color.GRAY);
		textArea.setEditable(false);
		add(textArea);

		connBtn.setText("접속하기");
		connBtn.setBounds(0, 420, 100, 40);
		add(connBtn);
		connBtn.addActionListener(this);

		input.setBounds(100, 420, 300, 40);
		add(input);
		input.addActionListener(this);
		input.setFont(font);

		inputBtn.setText("보내기");
		inputBtn.setBounds(400, 420, 80, 40);
		add(inputBtn);
		inputBtn.addActionListener(this);

	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == connBtn) {
			if (connBtn.getText().equals("접속하기")) {

				this.client.startClient(userIp.getText(), port);
				if (this.client.getSocket()!=null) {
					String msg = textArea.getText();
					msg += "[채팅방 접속]\n";
					textArea.setText(msg);
					connBtn.setText("종료하기");
					input.requestFocus();
				}
			} else {
				this.client.stopClient();
				String msg = textArea.getText();
				msg += "[채팅방 퇴장]\n";
				textArea.setText(msg);
				connBtn.setText("접속하기");
			}

		}
		// if(e.getSource() == input) {
		// this.client.send(userName.getText() + ": " + input.getText() + "\n");
		// input.setText("");
		// input.requestFocus();
		// }
		if (e.getSource() == inputBtn) {
			// String msg = textArea.getText();
			String msg = userName.getText() + ": " + input.getText() + "\n";

			this.client.send(msg);
			input.setText("");
			input.requestFocus();
		}
	}

}
