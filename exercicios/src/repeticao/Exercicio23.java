package repeticao;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num, contador = 0;
		
		do  {
			System.out.print("Informe um número inteiro: ");
			num = leitor.nextInt();
		} while (num % 1 != 0);
		
		System.out.print("Números primos entre 1 e " + num + ": ");

		for ( int i = 2; i <= num; i++) {
			contador = 0;
			for ( int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			
			if (contador == 2)
				System.out.print(i + " ");
		}
		leitor.close();
		
	}

}

/*
Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. 
O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.

*/