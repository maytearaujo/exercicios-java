package listas;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] numeros = new int [20];
		int [] pares;
		int []impares; 
		int qtdPares = 0, qtdImpares = 0, par = 0, impar = 0;
		
		for (int i = 0; i < 20; i++) {
				System.out.print("Informe o " + (i+1) + "º número inteiro: ");
				numeros[i] = input.nextInt();
		}
		
		for (int n : numeros) {
			if ( n % 2 == 0)
				qtdPares ++;
			else
				qtdImpares++;
		}
		
		pares = new int[qtdPares];
		impares = new int [qtdImpares];
		
		for (int n : numeros) {
			if (n % 2 == 0) {
				pares[par] = n;
				par++;
			}
			else {
				impares[impar] = n;
				impar++;
			}
		}
		
		System.out.println("\nNúmeros Digitados: ");
		for ( int num : numeros) 
			System.out.print(num + " ");
		
		
		System.out.println("\n\nNúmeros pares: ");
		for (int p : pares)
			System.out.print(p + " ");

		System.out.println("\n\nNúmeros impares: ");
		for (int i : impares)
			System.out.print(i + " ");
		
		input.close();
	}

}

/*
 Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
*/
