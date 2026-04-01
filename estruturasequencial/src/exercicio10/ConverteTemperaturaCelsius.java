package exercicio10;
import java.util.Scanner;

public class ConverteTemperaturaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float C, F;
		
		System.out.println("Informe a temperatura em graus Celsius");
		C = leitor.nextFloat();
		
		F = (C * 9/5) + 32;
		System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius ", C, F);
	}

}
