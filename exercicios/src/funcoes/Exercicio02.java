package funcoes;
import java.util.Scanner;

public class Exercicio02 {

	public static String gerarSequencia(int numero) {
	
		String sequencia = "";
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = 1; j <= i; j++  ) {
				sequencia += j + " ";
			}
			sequencia += "\n";
		}
		
		return sequencia;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe um número: ");
		numero = leitor.nextInt();
		
		System.out.println(gerarSequencia(numero));
		
		leitor.close();

	}

}
/*
Faça um programa para imprimir:
1
1   2
1   2   3
.....
1   2   3   ...  n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
*/