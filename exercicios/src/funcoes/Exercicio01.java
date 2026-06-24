package funcoes;
import java.util.Scanner;

public class Exercicio01 {
	
	public static String gerarSequencia(int numero) {
		String sequencia = "";
		
		for(int i = 1; i <= numero; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				sequencia += i + " ";
			}
			sequencia += "\n";
		}
		
		return sequencia;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = leitor.nextInt(); 
		
		System.out.println(gerarSequencia(numero));
		
		leitor.close();
	}

}

/*
Faça um programa para imprimir:
1
2   2
3   3   3
.....
n   n   n   n   n   n  ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
*/