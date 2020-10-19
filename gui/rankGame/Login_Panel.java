package gui_rankGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_Panel extends JPanel implements ActionListener
{
	JButton find_button = null;
	JButton login_button = null;
	JButton join_button = null;
	
	JTextField id_tf = null;
	JTextField pw_tf = null;
	Login_Panel(){
		
			
		setLayout(null); // 배치관리자 설정 x 
		
		Font font = new Font("", Font.BOLD, 50); // 글씨체 설정

		JLabel label = new JLabel("Sign In");
		label.setFont(font); // 글씨체 적용
		label.setBackground(Color.pink);
		label.setOpaque(true);//투명도
		label.setBounds(85, 20, 180, 80); // x , y , w , h
		add(label);

		font = new Font("", Font.BOLD, 15);

		JLabel id = new JLabel(" ID :");
		id.setBackground(Color.PINK);
		id.setOpaque(true);
		id.setFont(font);
		id.setBounds(20, 150, 50, 40);
		add(id);

		JLabel pw = new JLabel(" PW :");
		pw.setBackground(Color.PINK);
		pw.setOpaque(true);
		pw.setFont(font);
		pw.setBounds(20, 200, 50, 40);
		add(pw);

		login_button = new JButton("로그인");
		login_button.setBackground(Color.RED);
		login_button.setForeground(Color.BLACK);//글씨 색
		login_button.setFont(font);
		login_button.setBounds(260, 140, 80, 100);
		login_button.addActionListener(this);
		add(login_button);

		join_button = new JButton("회원가입");
		join_button.setBackground(Color.YELLOW);
		join_button.setFont(font);
		join_button.setBounds(60, 280, 120, 30);
		join_button.addActionListener(this);
		add(join_button);

		find_button = new JButton("ID/PW 찾기");
		find_button.setBackground(Color.BLACK);
		find_button.setForeground(Color.WHITE);
		find_button.setFont(font);
		find_button.setBounds(200, 280, 120, 30);
		find_button.addActionListener(this);
		add(find_button);

		id_tf = new JTextField(5);
		id_tf.setText("아이디를 입력하세요 ");
		id_tf.setBounds(80, 155, 170, 30);
		id_tf.addActionListener(this);
		add(id_tf);

		pw_tf = new JTextField(5);
		pw_tf.setBounds(80, 205, 170, 30);
		pw_tf.addActionListener(this);
		add(pw_tf);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == find_button) {
			_MainSystem.frame.setContentPane(new Find_Panel());	
			_MainSystem.frame.revalidate();
		}
		else if (e.getSource() == join_button) {
			Join_Panel join_panel = new Join_Panel();
			_MainSystem.frame.setContentPane(join_panel);	
			_MainSystem.frame.revalidate();
		}
		else if (e.getSource() == login_button) {
			String log = FileManager.instance.login(id_tf.getText(), pw_tf.getText());
			System.out.println(log);
			if(log.equals("")) {
				JOptionPane.showMessageDialog(null, 
						"id 와 pw 를 확인하세요", 
						"로그인실패",
						JOptionPane.WARNING_MESSAGE);
			}
			else {
				_MainSystem.frame.setContentPane(new Game_Panel());	
				_MainSystem.frame.revalidate();
			}		
		}	
	}


}
