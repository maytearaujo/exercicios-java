package funcoes;
import java.util.Scanner;

public class Exercicio04 {
	
	public static char verificarPositivoNegativo(int numero) {
		char situacao;
		
		if (numero > 0)
			situacao = 'P';
		else
			situacao ='N';
		
		return situacao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("informe um numero: ");
		numero = input.nextInt();
		
		System.out.println(verificarPositivoNegativo(numero));
		
		input.close();
		
	}

}
/*
Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
*/