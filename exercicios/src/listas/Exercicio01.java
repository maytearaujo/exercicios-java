package listas;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] numeros = new int [5];
		
		for (int i = 0; i < 5; i++) {
			do {
				
				System.out.print("Informe o " + (i+1) +"º número inteiro: ");
				numeros[i] = leitor.nextInt();
				
			} while (numeros[i] < 0);
		}
		
		for (int numero: numeros)
			System.out.print(numero + " ");
		
		leitor.close();

	}

}

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/