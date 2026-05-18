package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);		
		int menor, maior, soma = 0, i = 1;
		char resposta =' ';
		ArrayList<Integer> numeros = new ArrayList<>();
		
		do {
			System.out.print("Informe o " + i + " número: ");
			numeros.add(leitor.nextInt());
			
			i++;
			
			do {
				System.out.print("\nDeseja continuar digitando números? (S - Sim    N - Não)\n");
				resposta = Character.toLowerCase(leitor.next().charAt(0));
			} while (resposta != 's' && resposta != 'n');
			
		} while (resposta == 's');
		
		maior = numeros.getFirst();
		menor = numeros.getFirst();
		soma = numeros.getFirst();
		
		for (int n = 1; n < numeros.size(); n++) {
			soma += numeros.get(n);
			
			if (numeros.get(n) > maior)
				maior = numeros.get(n);
			
			if (numeros.get(n) < menor)
				menor = numeros.get(n);
		}
		System.out.printf("Menor: %d\n Maior: %d\n Soma: %d", menor, maior, soma);
			
			
		leitor.close();
	}

}

/*
Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

*/