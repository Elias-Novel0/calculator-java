import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Iterator;

public class Calculadora {
	public static void main(String[] args) {
		
		// Creando interfaz
		int widthFrame = Toolkit.getDefaultToolkit().getScreenSize().width, heightFrame = Toolkit.getDefaultToolkit().getScreenSize().height;
		JFrame frameForCalculator = new JFrame("Calculator");
		frameForCalculator.setSize(widthFrame/5, heightFrame/2);
		frameForCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameForCalculator.setLocationRelativeTo(null);
		
		JPanel screenPanel = new JPanel(new BorderLayout());
		JPanel keyboardPanel = new JPanel(new GridLayout(4, 4));
		frameForCalculator.add(screenPanel, BorderLayout.NORTH);
		frameForCalculator.add(keyboardPanel);
		
		JButton interfaceButtons [] = new JButton [16];
		
		CalculatorLogic calculatorLogic = new CalculatorLogic();
		byte valuesForButtons [] = {7,8,9,4,4,5,6,3,1,2,3,2,0,0,0,1};
		
		for (byte i = 3; i < 16; i+=4) {
			for (byte j = 3; j > 0; j--) {
				interfaceButtons[i-j] = new DigitButton(valuesForButtons[(i-j)], 16, calculatorLogic);
				keyboardPanel.add(interfaceButtons[i-j]);
			}
			interfaceButtons[i] = new OperatorButton(valuesForButtons[i], 16, calculatorLogic);
			keyboardPanel.add(interfaceButtons[i]);
		}
		
		frameForCalculator.setVisible(true);
	}
}
