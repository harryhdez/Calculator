package calculatorClassPackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

public class MathOperatorButton extends Button{
	
	public MathOperatorButton(String label){
		this.setLabel(label);
		this.setFont(new Font("SansSerif", Font.PLAIN, 20));
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.WHITE);
	}

}
