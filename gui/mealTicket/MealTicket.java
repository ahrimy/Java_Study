package gui_mealTicket;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MealTicket {
	static JFrame frame = new JFrame();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 600;

		int height = 700;

		frame.setTitle("Meal Ticket");

		Toolkit tk = Toolkit.getDefaultToolkit();

		Dimension screenSize = tk.getScreenSize();
		
		frame.setSize(width, height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);



		frame.setLocation(screenSize.width / 2 - width / 2, screenSize.height / 2 - height / 2);

		frame.setContentPane(new SelectPanel());

		frame.revalidate();
	}

}
