package calculatorClassPackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

public class SpecialOperatorButton extends Button{

	public SpecialOperatorButton(String label){
		this.setLabel(label);
		this.setFont(new Font("SansSerif", Font.PLAIN, 20));
		this.setBackground(Color.RED);
		this.setForeground(Color.WHITE);
	}
}
