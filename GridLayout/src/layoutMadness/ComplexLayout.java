package layoutMadness;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ComplexLayout extends JFrame {
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JRadioButton rbtn1 = new JRadioButton("red");
	private JRadioButton rbtn2 = new JRadioButton("green");
	private JRadioButton rbtn3 = new JRadioButton("blue");
	private JLabel label1 = new JLabel("Ein komplexes Layout");
	private JLabel label2 = new JLabel("Bitte Text eingeben:");
	private JTextArea text = new JTextArea();
	
	public ComplexLayout() {
		panel1.setLayout(new GridLayout(3,1));
		panel2.setLayout(new BorderLayout());
		
		panel1.add(rbtn1);
		panel1.add(rbtn2);
		panel1.add(rbtn3);
		
		panel2.add(label2);
		panel2.add(text);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		add(label1, BorderLayout.NORTH);
		add(panel1, BorderLayout.WEST);
		add(panel2, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		ComplexLayout c = new ComplexLayout();
		c.setSize(200,200);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
