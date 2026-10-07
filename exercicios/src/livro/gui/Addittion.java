package livro.gui;
import javax.swing.JOptionPane;

public class Addittion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNumber = 
				JOptionPane.showInputDialog("Enter first integer: ");
		
		String secondNumber = 
				JOptionPane.showInputDialog("Enter second number: ");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showInternalMessageDialog(null, "The sum is " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
	}

}
