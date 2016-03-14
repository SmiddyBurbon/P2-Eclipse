package v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Aufg8 extends JFrame {
	private JLabel labelPlayMode = new JLabel("Play Mode");
	private JLabel labelPlayer1 = new JLabel("Player 1");
	private JLabel labelPlayer2 = new JLabel("Player 2");
	private JLabel labelDifficulty = new JLabel("Difficulty");
	
	private String[] playModes = {"Local 1v1", "Local 1vAI", "Network Game (Server Mode)", "Network Game (Client Mode)"};
	private JComboBox boxPlayMode = new JComboBox(playModes);
	
	private String[] difficulties = {"Easy", "Medium", "Hard", "Very Hard"};
	private JComboBox boxDifficulty = new JComboBox(difficulties);
	
	private JTextField textPlayer1 = new JTextField(16);
	private JTextField textPlayer2 = new JTextField(16);
	
	private JCheckBox checkPlayer1 = new JCheckBox("Player 1 Mouse Control");
	private JCheckBox checkPlayer2 = new JCheckBox("Player 2 Mouse Control");
	
	private JButton btnCancel = new JButton("Cancel");
	private JButton btnSave = new JButton("Save");
	
	private JPanel gridView = new JPanel(new GridLayout(5,2));
	private JPanel buttons = new JPanel(new FlowLayout());
	
	public Aufg8(String title) {
		super(title);
		
		textPlayer1.setText("Player 1 Name");
		textPlayer2.setText("Player 2 Name");
		
		gridView.add(labelPlayMode);
		gridView.add(boxPlayMode);
		gridView.add(labelPlayer1);
		gridView.add(textPlayer1);
		gridView.add(labelPlayer2);
		gridView.add(textPlayer2);
		gridView.add(checkPlayer1);
		gridView.add(checkPlayer2);
		gridView.add(labelDifficulty);
		gridView.add(boxDifficulty);
		
		buttons.add(btnCancel);
		buttons.add(btnSave);
		
		add(gridView);
		add(buttons, BorderLayout.SOUTH);
		
		
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg8("BorderLayout");
		frame.setSize(480,240);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
