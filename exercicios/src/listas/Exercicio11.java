package listas;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] vetor1 = new int [10];
		int [] vetor2 = new int [10];
		int [] vetor3 = new int [10];
		int [] vetorUniao = new int [30];
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
		
		System.out.println("\nVamos cadastrar o 3º vetor:\n");
		for (int i = 0; i < 10; i ++) {
			System.out.print("Informe o " + (i+1) + "º valor: ");
			vetor3[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < vetorUniao.length; i+=3) {
			vetorUniao[i] = vetor1[j];
			vetorUniao[i+1] = vetor2[j];
			vetorUniao[i+2] = vetor2[j];
			j++;
		}
		
		System.out.print("\nUnião dos vetores:\n");
		for (int n: vetorUniao)
			System.out.print(n + " ");
		
		leitor.close();

	}

}

/*
 Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
*/
