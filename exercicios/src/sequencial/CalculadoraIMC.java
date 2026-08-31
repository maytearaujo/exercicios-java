package sequencial;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu peso (KG): ");
		peso = input.nextDouble();
		
		System.out.print("Informe sua altura (m): ");
		altura = input.nextDouble();

		imc = peso / (altura * altura);
		
		System.out.printf("%nSeu IMC: %.1f%n1%n", imc);
		
		System.out.println("\nValores de IMC\r\n"
				+ "Abaixo do peso: menos de 18,5\r\n"
				+ "Normal: entre 18,5 e 24,9\r\n"
				+ "Sobrepeso: entre 25 e 29,9\r\n"
				+ "Obesidade: 30 ou mais");
		
		input.close();
	}

}
