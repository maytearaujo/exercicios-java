package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		ArrayList<Float> notas = new ArrayList<>();
		int i = 1;
		char resposta = ' ';
		float media = 0, soma = 0;
		
		do {
			System.out.print("Informe a " + i + "ª nota: ");
			notas.add(leitor.nextFloat());
			
			do {
				System.out.println("\nDeseja digitar outra nota? (S - Sim    N - Não)");
				resposta = Character.toLowerCase(leitor.next().charAt(0));
			} while (resposta != 's' && resposta != 'n');
			
			if (resposta == 's')
				i++;
				
		} while (resposta == 's');
		
		for (float n : notas) {
			soma += n;
		}
		
		media = soma / notas.size();
		System.out.println("A média aritimética dos números digitados é " + media);
		leitor.close();
	}

}
// Faça um programa que calcule o mostre a média aritmética de N notas.

