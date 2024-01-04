import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class OperatorButton extends JButton implements ActionListener {
	private byte buttonOperation;
	private CalculatorLogic calculatorLogic;

	
	public OperatorButton(byte operation, int fontSize, CalculatorLogic calculatorLogicInstance) {
	    super(); 
	    switch (operation) {
	        case 1:
	            setText("+");
	            setFont(new Font("Arial", Font.BOLD, fontSize));
	            this.buttonOperation = operation;
	            calculatorLogic = calculatorLogicInstance;
	            break;
	        case 2:
	            setText("-"); 
	            this.buttonOperation = operation;
	            calculatorLogic = calculatorLogicInstance;
	            break;
	        case 3:
	            setText("*"); 
	            this.buttonOperation = operation;
	            calculatorLogic = calculatorLogicInstance;
	            break;
	        case 4:
	            setText("/"); 
	            this.buttonOperation = operation;
	            calculatorLogic = calculatorLogicInstance;
	            break;
	    }
	    addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		calculatorLogic.solveOperation();
		calculatorLogic.setOperator(buttonOperation);
		DigitButton.restartDigitCounter();
		
	}
	
}
