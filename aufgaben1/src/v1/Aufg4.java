package v1;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufg4 extends JFrame {
	private String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
	
	public Aufg4(String title) {
		super(title);
		
		setLayout(new GridLayout(4,4));
		
		for(int i=0; i < 16; i++) {
			add(new JButton(buttons[i].toString()));
		}
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg4("Calculator");
		frame.setSize(320,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
