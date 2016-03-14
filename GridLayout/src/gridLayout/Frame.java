package gridLayout;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new Layout("Huhu");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
