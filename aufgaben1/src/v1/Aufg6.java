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

public class Aufg6 extends JFrame {
	private JPanel bg = new JPanel(new FlowLayout());
	private JButton btnOk = new JButton("Ok");
	
	public Aufg6(String title) {
		super(title);
		
		bg.setBackground(new Color(255, 255, 0));
		add(bg);
		add(btnOk, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg6("BorderLayout");
		frame.setSize(320,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
