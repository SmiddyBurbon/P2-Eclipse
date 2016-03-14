package v1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Aufg3 extends JFrame {
	private JTextField textField = new JTextField(6);
	private JRadioButton radioPlain = new JRadioButton("plain");
	private JRadioButton radioBold = new JRadioButton("bold");
	private JRadioButton radioItalic = new JRadioButton("italic");
	private JCheckBox checkbox = new JCheckBox("ich stimme zu…");
	private JButton btnOk = new JButton("Ok");
	private JButton btnCancel = new JButton("Cancel");
	
	public Aufg3(String title) {
		super(title);
		JPanel textCheck = new JPanel(new FlowLayout());
		JPanel radiobtns = new JPanel(new FlowLayout());
		JPanel buttons = new JPanel(new FlowLayout());
		ButtonGroup radioGroup = new ButtonGroup();
		
		textField.setText("Enter text here");
		
		textCheck.add(textField);
		textCheck.add(checkbox);
		
		radioGroup.add(radioPlain);
		radioGroup.add(radioBold);
		radioGroup.add(radioItalic);
		
		radiobtns.add(radioPlain);
		radiobtns.add(radioBold);
		radiobtns.add(radioItalic);
		
		buttons.add(btnCancel);
		buttons.add(btnOk);
		
		add(textCheck, BorderLayout.NORTH);
		add(radiobtns, BorderLayout.CENTER);
		add(buttons, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg3("Frame with many com…");
		frame.setSize(320,160);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
