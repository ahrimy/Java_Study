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
	     // ----시작 위치를 바탕화면의 중앙으로 바꾸는 코드
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize(); // 모니터 사이즈를 가져온다.
			frame.setLocation(screenSize.width / 2 - 500, screenSize.height / 2 - 400);
		// ----시작 위치를 바탕화면의 중앙으로 바꾸는 코드
	     frame.setContentPane(new TitlePanel());
	     frame.revalidate();
	}

}
