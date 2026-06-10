package listas;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] vetor1 = new int [10];
		int [] vetor2 = new int [10];
		int [] vetor3 = new int [20];
		int j = 0;
		
		System.out.println("Vamos cadastrar o 1º vetor:\n");
		for (int i = 0; i < 10; i ++) {
			System.out.print("Informe o " + (i+1) + "º valor: ");
			vetor1[i] = leitor.nextInt();
		}
		
		System.out.println("\nVamos cadastrar o 2º vetor:\n");
		for (int i = 0; i < 10; i ++) {
			System.out.print("Informe o " + (i+1) + "º valor: ");
			vetor2[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < vetor3.length; i+=2) {
			vetor3[i] = vetor1[j];
			vetor3[i+1] = vetor2[j];
			j++;
		}
		
		System.out.print("\nUnião dos vetores:\n");
		for (int n: vetor3)
			System.out.print(n + " ");
		
		leitor.close();
	}

}

/*
Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
 cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
*/