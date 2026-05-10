package decisao;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float number1, number2;
		char operation;
		float result = 0, resultRounded = 0;
		String isPositive = "Negativo", isEven = "Impar", isInteger = "Decimal";
		
		System.out.print("Informe o 1º número: ");
		number1 = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		number2 = leitor.nextInt();
		
		System.out.println("Informe qual operação deseja realizar: \n"
			+ "1. Adição\n"
			+ "2. Subtração\n"
			+ "3. Multiplicação\n"
			+ "4. Divisão");
		
		operation = leitor.next().charAt(0);
		
		switch (operation) {
		case '1':
			result = number1 + number2;
			break;
			
		case '2':
			result = number1 - number2;
			break;
			
		case '3':
			result = number1 * number2;
			break;
			
		case '4':
			result = number1 / number2;
			break;
		
		default:
			System.out.println("Operação inválida.");
			
		}
		
		if (result > 0)
			isPositive = "Positivo";
		
		resultRounded = Math.round(result);
		if (resultRounded == result) {
			isInteger = "Inteiro";
			
			if (result % 2 == 0)
				isEven = "Par";
		} else
			isEven = "não é classificado entre par e impar por ser";
		
	System.out.println(result + " é " + isPositive + ", " + isEven + ", " + isInteger);
		
		leitor.close();

	}

}
