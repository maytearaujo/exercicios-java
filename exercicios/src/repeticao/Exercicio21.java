package repeticao;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num, contador = 0;
		
		do {
			System.out.print("Informe um número inteiro: ");
			num = leitor.nextInt();
			
		} while (num <= 0);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				contador++;
		}
		
		if (contador == 2)
			System.out.printf("%d é primo", num);
		else
			System.out.printf("%d não é primo", num);

		leitor.close();
	}

}
// Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

