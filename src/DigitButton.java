import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DigitButton extends JButton implements ActionListener{
	private byte numericValueForButton;
	private CalculatorLogic calculatorLogic;
	private static byte digitCounter = 0;
	
	public DigitButton(byte numericValueForButton, int fontSize, CalculatorLogic calculatorLogicInstance) {
		super(String.valueOf(numericValueForButton));
		this.numericValueForButton = numericValueForButton;
		setFont(new Font("Arial", Font.BOLD, fontSize));
		calculatorLogic = calculatorLogicInstance;
		addActionListener(this);
	}
	
	public static void restartDigitCounter() {
		digitCounter = 0;
	}
	
		
	public void actionPerformed (ActionEvent e) {
		if (digitCounter < 16) {
			calculatorLogic.setOperand2(numericValueForButton);
			digitCounter = (byte) (digitCounter + 1);
		}
		System.out.println(calculatorLogic.getOperand1() + " - Operador: " + calculatorLogic.getOperator() + " - " + calculatorLogic.getOperand2() );
	}
}
