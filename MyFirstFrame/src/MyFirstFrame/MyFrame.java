package MyFirstFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("Hier klicken");
	
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		add(btn, FlowLayout.LEFT);
	}
}