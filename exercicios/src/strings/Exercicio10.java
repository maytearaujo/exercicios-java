package strings;
import java.util.Scanner;

public class Exercicio10 {
	
	public static String numeroPorExtenso(int numero) {
		
		int unidade, dezena;
		String numeroExtenso ="";
		
		String [] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String [] especiais = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		String [] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
		
		

		dezena = numero / 10;
		unidade = numero % 10;
		
		if (numero >= 0 && numero < 10 )
			System.out.println(unidades[unidade]);
		else if (numero >=10 && numero <= 19)
			numeroExtenso = especiais[unidade];
		else {
			
			if (unidade > 0)
				numeroExtenso = dezenas[dezena] + " e " + unidades[unidade];
			else
				numeroExtenso = dezenas[dezena];
		}
		
		return numeroExtenso;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero;
		
		
		do {
			System.out.print("Informe um número de 0 a 99: ");
			numero = input.nextInt();
		} while ( numero < 0 || numero >= 100);
		
		
		System.out.println(numeroPorExtenso(numero));
		input.close();
	}

}

/*
Número por extenso. Escreva um programa que solicite ao usuário a digitação de um número até 99 e imprima-o na tela por extenso.

*/