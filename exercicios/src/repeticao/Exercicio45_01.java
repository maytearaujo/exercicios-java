package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio45_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char [] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};
		char resposta, novoCalculo;
		int nota = 0, maior, menor, soma = 0, notaAtual;
		float media = 0;
		ArrayList <Integer> notas = new ArrayList<>();
		
		do {
			for (int i = 0; i < gabarito.length; i++ ) {
				do {
					System.out.print("Informe a " + (i+1) + "ª resposta: ");
					resposta = Character.toUpperCase(input.next().charAt(0));
				}
				while (resposta != 'A' && resposta != 'B' && resposta != 'C' && resposta != 'D' && resposta != 'E');
				
				if (resposta == gabarito[i]) {
					nota++;
				}
			}
			
			notas.add(nota);
			
			System.out.printf("\n%d Acertos\nNota: %d", nota, nota);
			
			nota = 0;
			do {
				System.out.print("\n\nOutro aluno deseja utilizar o sistema? \nS - Sim   N - Não: ");
				novoCalculo = Character.toLowerCase(input.next().charAt(0));
			} while (novoCalculo != 's' && novoCalculo != 'n');
			
			System.out.println("");
		} while (novoCalculo == 's');
		
		if (notas.size() != 0) {
		maior = notas.get(0);
		menor = notas.get(0);
		soma = notas.get(0);
		
		for (int i = 1; i < notas.size(); i++) {
			notaAtual = notas.get(i);
			soma += notaAtual;
			
			if (notaAtual > maior) {
				maior = notaAtual;
			}
			
			if (notaAtual < menor) {
				menor = notaAtual;
			}
		}
		
		media = (float)soma / notas.size();
		
		System.out.printf(""
				+ "Maior Acerto: %d\n"
				+ "Menor Acerto: %d\n"
				+ "Total de Alunos que utilizaram o sistema: %d\n"
				+ "A Média das Notas da Turma: %.0f", maior, menor, notas.size(), media);
		}
		input.close();

	}

}

/*
Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões, o programa deve perguntar ao aluno
 a resposta de cada questão e ao final comparar com o gabarito da prova e assim calcular o total de acertos e a nota 
 (atribuir 1 ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno 
 vai utilizar o sistema. Após todos os alunos terem respondido informar:
Maior e Menor Acerto;
Total de Alunos que utilizaram o sistema;
A Média das Notas da Turma.
Gabarito da Prova:

01 - A
02 - B
03 - C
04 - D
05 - E
06 - E
07 - D
08 - C
09 - B
10 - A
Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.
*/