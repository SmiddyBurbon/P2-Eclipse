package v1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aufg1 extends JFrame {
	private JTextField textField = new JTextField(12);
	private JLabel label = new JLabel("Bitte Text eingeben");
	private JButton btnOk = new JButton("Ok");
	private JButton btnCancel = new JButton("Cancel");
	
	public Aufg1(String title) {
		super(title);
		JPanel text = new JPanel(new FlowLayout());
		JPanel buttons = new JPanel(new FlowLayout());
		
		text.add(label);
		text.add(textField);
		
		buttons.add(btnCancel);
		buttons.add(btnOk);
		
		add(text, BorderLayout.NORTH);
		add(buttons, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Aufg1("Fenster mit Textfeld");
		frame.setSize(360,120);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
