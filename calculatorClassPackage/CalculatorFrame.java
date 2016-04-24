package calculatorClassPackage;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame{

	private final int MAX_CHARACTERS = 7;
	private final int BUTTONS_COLUMNS = 4;
	private final int BUTTONS_ROWS = 5;
	
	private JTextField textField = new JTextField(MAX_CHARACTERS);
	private ArrayList<Button> button = new ArrayList<Button>();
	
	public CalculatorFrame(){}
	
	public void run(){
		
		setSize(300, 400);
		setLocation(525, 200);
		setLayout(new BorderLayout());
		setTitle("Simple Calculator");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("..\\resources\\calculator.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(createTextFieldPanel(), BorderLayout.NORTH);
		
		add(createButtonsPanel(), BorderLayout.CENTER);
	}
	
	private JPanel createTextFieldPanel(){
		
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setLayout(new BorderLayout());
		
		//textField.setEditable(false);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 55));
		
		textFieldPanel.add(textField, BorderLayout.CENTER);
		
		return textFieldPanel;
	}
	
	private JPanel createButtonsPanel(){
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(BUTTONS_ROWS, BUTTONS_COLUMNS));
		
		createButtons();
		
		for(Button b: button){
			buttonsPanel.add(b);
		}
		
		return buttonsPanel;
	}
	
	private void createButtons(){
		button.add(new SpecialOperatorButton("C"));
		button.add(new MathOperatorButton("/"));
		button.add(new MathOperatorButton("X"));
		button.add(new SpecialOperatorButton("<-"));
		button.add(new NumberButton("7"));
		button.add(new NumberButton("8"));
		button.add(new NumberButton("9"));
		button.add(new MathOperatorButton("-"));
		button.add(new NumberButton("4"));
		button.add(new NumberButton("5"));
		button.add(new NumberButton("6"));
		button.add(new MathOperatorButton("+"));
		button.add(new NumberButton("1"));
		button.add(new NumberButton("2"));
		button.add(new NumberButton("3"));
		button.add(new MathOperatorButton("()"));
		button.add(new NumberButton("0"));
		button.add(new MathOperatorButton("."));
		button.add(new MathOperatorButton("+/-"));
		button.add(new SpecialOperatorButton("="));
	}
}
