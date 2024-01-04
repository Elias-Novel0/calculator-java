public class CalculatorLogic {
	private long operand1, operand2;
	private byte operator;
	
	public CalculatorLogic() {
		operand1 = 0;
		operand2 = 0;
		operator = 0;
	}
	
	public void setOperand1(long value) {
		operand1 = value; 
	}
	
	public void setOperand2(long value) {
		operand2 = operand2 * 10 + value;
	}
	
	public void setOperator(byte operator) {
		this.operator = operator;  
	}
	
	public long getOperand1() {
		return operand1;
	}
	
	public long getOperand2() {
		return operand2;
	}
	
	public byte getOperator() {
		return operator;
	}
	
	public  void solveOperation () {
		switch (operator) {
		case 0:
			operand1 = operand2;
			break;
		case 1:
			operand1 = operand1 + operand2;
			break;
		case 2:
			operand1 = operand1 - operand2;
			break;
		case 3:
			operand1 = operand1 * operand2;
			break;
		case 4:
			try {
				operand1 = operand1 / operand2;
			} catch (Exception e) {
				System.out.println("Dividir por cero no está permitido");
			}
			break;
		}  
		operand2 = 0;
	}
	
}
