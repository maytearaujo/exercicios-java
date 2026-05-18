package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float maior, menor, media, soma = 0;
		ArrayList <Float> temperatura = new ArrayList<>();
		char resposta = ' ';
		
		do {
			System.out.print("Informe a temperatura: ");
			temperatura.add(leitor.nextFloat());
			
			do {
				System.out.println("\nDeseja digitar outra temperatura?");
				resposta = Character.toLowerCase(leitor.next().charAt(0));
			} while (resposta != 's' && resposta != 'n');
		} while (resposta == 's');
		
		maior = temperatura.get(0);
		menor = temperatura.get(0);
		soma = temperatura.get(0);
		
		for (int i = 1; i < temperatura.size(); i++) {
			soma += temperatura.get(i);
			
			if (temperatura.get(i) > maior) {
				maior = temperatura.get(i);
			}
			
			if ( temperatura.get(i) < menor) {
				menor = temperatura.get(i);
			}
		}
		
		media = soma / temperatura.size();
		
		System.out.println("Temperaturas\nMaior: " + maior +"\nMenor: " + menor + "\nMédia: " + media);
		
		leitor.close();
	}

}
/*
O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.

*/