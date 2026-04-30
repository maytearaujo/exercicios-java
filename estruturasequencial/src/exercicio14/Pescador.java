package exercicio14;
import java.util.Scanner;

public class Pescador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float peso, multa, excesso;
		
		System.out.print("Informe o peso do peixe: ");
		peso = leitor.nextFloat();
		
		if (peso > 50 ) {
			excesso = peso - 50;
			multa  = excesso * 4;
			System.out.printf("O peso do peixe excedeu em %.2f kg o limite permitido e será necessário pagar R$ %.2f de multa.", excesso, multa);
		}
		else {
			System.out.println("O peso do peixe está dentro do limite permitido");
		}
		
		leitor.close();
	}

}


/*
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
 *  deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) 
 *  e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
 *   Imprima os dados do programa com as mensagens adequadas.

/
 */