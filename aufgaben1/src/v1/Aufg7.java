package v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Aufg7 extends JFrame {
	private JPanel bg = new JPanel(new FlowLayout());
	private JPanel buttons = new JPanel(new FlowLayout());
	private JButton btnCancel = new JButton("Cancel");
	private JButton btnOk = new JButton("Ok");
	
	public Aufg7(String title) {
		super(title);
		
		bg.setBackground(new Color(255, 255, 0));
		add(bg);
		buttons.add(btnCancel);
		buttons.add(btnOk);
		add(buttons, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg7("BorderLayout");
		frame.setSize(320,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
