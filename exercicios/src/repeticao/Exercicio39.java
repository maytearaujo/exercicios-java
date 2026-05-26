package repeticao;
import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] alunos = new int [10][2];
		int maisAlto, maisBaixo, indiceMaisAlto = 0, indiceMaisBaixo = 0, alturaAtual;
		final int POSICAO_CODIGO = 0, POSICAO_ALTURA = 1;
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("\n" +(i+1) +"º aluno\n");
			System.out.print("Informe o código: ");
			alunos[i][POSICAO_CODIGO] = leitor.nextInt();
			
			System.out.print("Informe a altura (cm): ");
			alunos[i][POSICAO_ALTURA] = leitor.nextInt();
		}
		
		maisAlto = alunos[0][1];
		maisBaixo = alunos[0][1];
		
		for (int i = 1; i < alunos.length; i++) {
			alturaAtual = alunos[i][POSICAO_ALTURA];
			if (alturaAtual > maisAlto) {
				maisAlto = alunos[i][POSICAO_ALTURA];
				indiceMaisAlto = i;
			}
			
			if (alturaAtual < maisBaixo) {
				maisBaixo = alunos[i][POSICAO_ALTURA];
				indiceMaisBaixo = i;
			}
		}
		
		System.out.println("\n    Mais Alto: \nCódigo: "+ alunos[indiceMaisAlto][POSICAO_CODIGO] + "\nAltura (cm): "+ alunos[indiceMaisAlto][POSICAO_ALTURA]+"\n\n    MaisBaixo\nCódigo: " + alunos[indiceMaisBaixo][POSICAO_CODIGO] + "\nAltura: " + alunos[indiceMaisBaixo][POSICAO_ALTURA]);
		leitor.close();
	}

}

/*
Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo 
representando a sua altura em centímetros.  Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno 
mais alto e o número do aluno mais baixo, junto com suas alturas.
*/