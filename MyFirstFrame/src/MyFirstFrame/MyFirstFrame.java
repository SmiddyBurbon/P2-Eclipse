package MyFirstFrame;

import javax.swing.JFrame;

public class MyFirstFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Meine erste Gui-App");
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}