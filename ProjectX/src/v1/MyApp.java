package v1;

import javax.swing.JFrame;

public class MyApp {

	public static void main(String[] args) {
		JFrame frame = new MyFrame("Huhu");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
