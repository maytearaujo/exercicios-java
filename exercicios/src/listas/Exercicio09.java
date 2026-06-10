package listas;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] numeros = new int [10];
		int somaQuadrado = 0, quadrado;
		
		for ( int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			numeros[i] = input.nextInt();
		}
		
		for (int num : numeros) {
			quadrado = num * num;
			somaQuadrado += quadrado;
		}
		
		System.out.println("\nSoma dos quadrados dos elementos: " + somaQuadrado);
		input.close();
	}

}

/*
Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
*/