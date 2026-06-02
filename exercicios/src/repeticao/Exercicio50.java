package repeticao;
import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int termos;
		float H = 0;
		
		do {
			System.out.print("Informe a quantidade de termos: ");
			termos = input.nextInt();
		} while (termos <= 0);
		
		System.out.print("H = ");
		for (int i = 1; i <= termos; i++) {
			H += 1 / (float)i;
			System.out.print(1 + "/" + i);

			if (i < termos) 
				System.out.print(" + ");
		}
		
		System.out.printf("\nValor de H: %.2f", H);
		
		input.close();

	}

}

/*
Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.
*/