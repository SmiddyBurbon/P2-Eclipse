package v1;

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

public class Aufg5 extends JFrame {
	private JLabel labelRed = new JLabel("Rot");
	private JLabel labelGreen = new JLabel("Grün");
	private JLabel labelBlue = new JLabel("Blue");
	
	private JSlider sliderRed = new JSlider(0, 255);
	private JSlider sliderGreen = new JSlider(0, 255);
	private JSlider sliderBlue = new JSlider(0, 255);
	
	private JTextField textRed = new JTextField(3);
	private JTextField textGreen = new JTextField(3);
	private JTextField textBlue = new JTextField(3);
	
	public Aufg5(String title) {
		super(title);
		
		JPanel panelRed = new JPanel(new FlowLayout());
		JPanel panelGreen = new JPanel(new FlowLayout());
		JPanel panelBlue = new JPanel(new FlowLayout());
		
		panelRed.add(labelRed);
		panelRed.add(sliderRed);
		panelRed.add(textRed);
		
		panelGreen.add(labelGreen);
		panelGreen.add(sliderGreen);
		panelGreen.add(textGreen);
		
		panelBlue.add(labelBlue);
		panelBlue.add(sliderBlue);
		panelBlue.add(textBlue);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.add(panelRed);
		verticalBox.add(panelGreen);
		verticalBox.add(panelBlue);
		
		add(verticalBox);
	}

	public static void main(String[] args) {
		JFrame frame = new Aufg5("SliderDemo");
		frame.setSize(320,160);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
