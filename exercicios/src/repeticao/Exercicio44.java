package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] candidatos = { "José", "João", "Maria", "Joana", "Voto Nulo", "Voto em Branco"};
		Scanner input = new Scanner(System.in);
		int candidato = 0, nulo = 0, branco = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
		int total = 0;
		ArrayList <Integer> votos = new ArrayList<>();
		float percentNulo, percentBranco;
		
		System.out.println("CANDIDATOS\n");
		
		for (int i = 0; i < candidatos.length; i++) {
			
			System.out.printf("%d - %-10s\n", (i+1), candidatos[i]);
		}
		
		System.out.println("");
		do {
			
			do {
				System.out.print("Informe o número do candidato: ");
				candidato = input.nextInt();
				if (candidato < 0 || candidato >= 7)
					System.out.println("Voto Inválido");
			}
			while (candidato < 0 || candidato >=7);
			
			
			switch (candidato) {
			case 1:
				candidato1++;
				break;
			case 2:
				candidato2++;
				break;
			case 3:
				candidato3++;
				break;
			case 4:
				candidato4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			}	
			
			if (candidato != 0 ) 
				total++;
			
		} while (candidato != 0 );
		
		votos.add(candidato1);
		votos.add(candidato2);
		votos.add(candidato3);
		votos.add(candidato4);
		votos.add(nulo);
		votos.add(branco);
		
		percentNulo = (100 * nulo) / total;
		percentBranco = (100 * branco) / total;
		
		System.out.printf("%-5s %-10s\n", "VOTOS", "CANDIDATOS");
		
		for (int i = 0; i < votos.size(); i++) {
			System.out.printf("%-5d %-25s\n", votos.get(i), candidatos[i] );
		}
		System.out.printf("Porcentagem nulos: %.0f%\nPorcentacem de brancos: %.0f%", percentNulo, percentBranco);
		input.close();

	}

}
 /*
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos utilizados são:
1 , 2, 3, 4  - Votos para os respectivos candidatos 
(você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
5 - Voto Nulo
6 - Voto em Branco
Faça um programa que calcule e mostre:
O total de votos para cada candidato;
O total de votos nulos;
O total de votos em branco;
A percentagem de votos nulos sobre o total de votos;
A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
*/