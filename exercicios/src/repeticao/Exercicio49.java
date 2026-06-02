package repeticao;
import java.util.Scanner;

public class Exercicio49 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		float soma = 0;
		float dividendo = 0, divisor = -1;
		int termos;
		
		do {
			
			System.out.print("Informe a quantidade de termos: ");
			termos = input.nextInt();
			
		} while (termos < 0);
		
		for (int i = 1; i <= termos; i ++) {
			dividendo ++;
			divisor += 2;
			soma += dividendo / divisor; 
			System.out.printf("%.0f/%.0f", dividendo, divisor);
			
			if (i < termos)
				System.out.print( " + ");
		}
		
		System.out.printf("\n\nSoma dos termos: %.2f", soma);
		input.close();
	}

}

/*
Faça um programa que mostre os n termos da Série a seguir:
S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
Imprima no final a soma da série.
*/