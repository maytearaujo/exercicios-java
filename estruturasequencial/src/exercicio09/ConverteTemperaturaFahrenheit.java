package exercicio09;
import java.util.Scanner;

public class ConverteTemperaturaFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float C, F;
		
		System.out.println("Informe a temperatura em graus Fahrenheit ");
		F = leitor.nextFloat();
		
		C = 5 * ((F-32) / 9);
		System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius ", F, C);
	}

}
