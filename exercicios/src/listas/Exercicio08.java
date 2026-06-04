package listas;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] idade = new int [5];
		float [] altura = new float [5];
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("\nInforme a idade: ");
			idade[i] = input.nextInt();
			
			System.out.print("Informe a altura: ");
			altura [i] = input.nextFloat();
		}
		
		System.out.printf("\n%5s %6s\n", "IDADE", "ALTURA");
		for (int i = idade.length-1; i >= 0; i--) {
			System.out.printf("%-5d %-6.1f\n", idade[i], altura[i]);
		}
		
		input.close();

	}

}

/*
Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.

*/