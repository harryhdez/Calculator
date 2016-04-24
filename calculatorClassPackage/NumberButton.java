package calculatorClassPackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

public class NumberButton extends Button{
	
	public NumberButton(String label){
		this.setLabel(label);
		this.setFont(new Font("SansSerif", Font.PLAIN, 20));
		this.setBackground(Color.LIGHT_GRAY);
		this.setForeground(Color.WHITE);
	}
}
