package gui_wordGame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainSystem {
	static JFrame frame = new JFrame();
	public static void main(String[] args) {
		 frame.setTitle("word game");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setSize(1000, 800);
	     frame.setVisible(true);
	     // ----���� ��ġ�� ����ȭ���� �߾����� �ٲٴ� �ڵ�
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize(); // ����� ����� �����´�.
			frame.setLocation(screenSize.width / 2 - 500, screenSize.height / 2 - 400);
		// ----���� ��ġ�� ����ȭ���� �߾����� �ٲٴ� �ڵ�
	     frame.setContentPane(new TitlePanel());
	     frame.revalidate();
	}

}
