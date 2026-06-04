package listas;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double [] numeros = new double [10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			numeros[i] = leitor.nextDouble();
		}
		
		for (int i = numeros.length -1; i >= 0; i--)
			System.out.print(numeros[i] + "   ");
		leitor.close();
	}

}

/*
Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
*/