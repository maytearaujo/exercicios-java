package repeticao;
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, numeroOriginal, resto;
		Scanner leitor = new Scanner(System.in);
		String stringInversa = "";
		int numeroInverso=0;
		
		do {
			System.out.print("Informe um número inteiro: ");
			numero = leitor.nextInt();
		} while (numero <= 0);
		
		numeroOriginal = numero;
		
		// Com string
		do {
			resto = numero % 10;
			stringInversa = stringInversa + Integer.toString(resto);
			numero = numero / 10;
			
			numeroInverso = resto * 10;
			
		} while (numero > 0);
		System.out.printf("\nVersão com String\n=> %s\n", stringInversa);
		
		
		// Com números
		numeroInverso = 0;
		do {

			
			resto = numeroOriginal % 10;
				numeroInverso = numeroInverso * 10 + resto;
		
			numeroOriginal = numeroOriginal / 10; 
			
		} while (numeroOriginal > 0);
		System.out.printf("\nVersão com números\n=> %s", numeroInverso);
		
		leitor.close();
	}

}

/*
Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
Exemplo:
  12376489
  => 98467321
 */