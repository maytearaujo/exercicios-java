package listas;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float [] notas = new float [4];
		float soma = 0, media;
		
		for (int i = 0; i < 4; i++) {
			do {
				System.out.print("Informe a " + (i + 1) + "ª nota: ");
				notas[i] = input.nextFloat();
			} while (notas[i] < 0);
			
			soma += notas[i];
		}
		
		media = soma / notas.length;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\n" + (i+1) +"ª nota: " + notas[i]);
		}
		System.out.printf("\n\nMédia: %.1f", media);
			
		input.close();
	}

}

/*
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
*/