package repeticao;
import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;
		float maior, menor = 0, media = 0, soma = 0, temp = 0;
		float [] notas = new float [7];
		
		System.out.print("Informe o nome: ");
		nome = input.nextLine();
		
		for (int i = 0; i < 7; i++) {
			System.out.print("Informe a nota do " + (i+1) + "º jurado: ");
			notas [i] = input.nextFloat();
		}
		
		
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = i+1; j < notas.length; j++) {
				if (notas[i] > notas[j]) {
					temp = notas[i];
					notas[i] = notas[j];
					notas[j] = temp;
				}				
			}
		}
		
		menor = notas[0];
		maior = notas[notas.length - 1];
		
		for (int i = 1; i < notas.length - 1; i++ ) {
			soma += notas[i];
		}

		media = soma / (notas.length - 2);
		
		System.out.printf(
				"\nResultado final:\n"
				+ "Atleta: %s\n"
				+ "Melhor nota: %.1f\n"
				+ "Pior nota: %.1f\n"
				+ "Média: %.2f",
				nome, maior, menor, media);
		
		input.close();

	}

}
/*
Em uma competição de ginástica, cada atleta recebe votos de sete jurados. A melhor e a pior nota são eliminadas. 
A sua nota fica sendo a média dos votos restantes. Você deve fazer um programa que receba o nome do ginasta e as notas dos 
sete jurados alcançadas pelo atleta em sua apresentação e depois informe a sua média, conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média com as notas restantes). As notas não são informados ordenadas. Um exemplo de saída do programa deve ser conforme o exemplo abaixo:
Atleta: Aparecido Parente
Nota: 9.9
Nota: 7.5
Nota: 9.5
Nota: 8.5
Nota: 9.0
Nota: 8.5
Nota: 9.7

Resultado final:
Atleta: Aparecido Parente
Melhor nota: 9.9
Pior nota: 7.5
Média: 9,04
*/