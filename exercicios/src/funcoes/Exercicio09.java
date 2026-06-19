package funcoes;
import java.util.Scanner;

public class Exercicio09 {
	
	public static String inverteNumero(int numero) {
		String numeroInverso = "";

		while (numero > 0) {
			numeroInverso += String.valueOf(numero % 10);
			numero /= 10;
			
		}
		
		return numeroInverso;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero;

		System.out.print("Informe um número: ");
		numero = input.nextInt();
		numero = Math.abs(numero);
		
		System.out.print(inverteNumero(numero));
		
		input.close();
	}

}

/*
Reverso do número. Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721.

*/