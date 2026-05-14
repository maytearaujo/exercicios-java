package repeticao;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args ) {
		Scanner leitor = new Scanner(System.in);
		int fatorial;
		int num = 0;
		char resposta = ' ';
		
		do {
			
			do {
				System.out.print("Informe um número inteiro, positivo e menor que 16 para cálculo do fatorial: ");
				num = leitor.nextInt();			
			} while( num < 0 || num >= 16);
			
			 fatorial = 1;
			
			for (int n = 1; n <= num; n++)
				fatorial *= n;
		
			System.out.printf("O fatorial de %d é %d", num, fatorial);
			System.out.println("\n\nDeseja calcular outro fatorial? (S - sim   N - Não) ");
			resposta = Character.toLowerCase(leitor.next().charAt(0));
		} while(resposta != 's' && resposta != 'n');
		
		System.out.print("Programa Finalizado!");
	}

}

/*
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e 
limitando o fatorial a números inteiros positivos e menores que 16.

*/