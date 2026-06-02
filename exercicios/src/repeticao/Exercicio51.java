package repeticao;
import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int termos;
		float S = 0, j = 1 ;
		
		do {
			System.out.print("Informe a quantidade de termos: ");
			termos = leitor.nextInt();
		} while (termos <= 0);
		
		for (int i = 1; i <= termos; i++) {
			S += (i / j);
			System.out.printf("%d/%.0f", i, j);
			j +=2;
			
			if (i < termos)
				System.out.print(" + ");
			
		}
		System.out.printf("\nSoma dos termos: %.2f", S);
	}

}

/*
Faça um programa que mostre os n termos da Série a seguir:
S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
Imprima no final a soma da série.
*/