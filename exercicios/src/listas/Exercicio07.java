package listas;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int[5];
		int soma = 0, multiplicacao = 1;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			numeros[i] = input.nextInt();
		}
		
		for (int n: numeros) {
			soma += n;
			multiplicacao *= n;
		}
		
		System.out.print("\nNúmeros Digitados: ");
		
		for (int n: numeros) {
			System.out.print(n + " ");
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		input.close();

	}

}
/*
Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

*/