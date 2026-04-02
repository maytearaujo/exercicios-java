package exercicio11;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int primeiro, segundo;
		float terceiro, produto, soma, cubo;
		
		System.out.println("Informe o 1º número: ");
		primeiro = leitor.nextInt();

		System.out.println("Informe o 2º número: ");
		segundo = leitor.nextInt();

		System.out.println("Informe o 3º número: ");
		terceiro = leitor.nextFloat();
		
		produto = (primeiro * 2) * (segundo /2.0f);
		soma = (primeiro * 3) + terceiro;
		cubo = (terceiro * terceiro * terceiro);
		
		System.out.printf("O produto do dobro de %d com metade de %d é igual a %.2f %n", primeiro, segundo, produto);
		System.out.printf("A soma do triplo de %d com o %.2f é %.2f %n", primeiro, terceiro, soma);
		System.out.printf("O %.2f elevado ao cubo é %.2f %n", terceiro, cubo);
		

		leitor.close();
	}

}
