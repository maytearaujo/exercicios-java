package repeticao;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float numeroMedioAlunos;
		int quantidadeTurmas, somaAlunos = 0, quantidadeAlunos;
		
		do {
			System.out.print("Informe a quantidade de turmas: ");
			quantidadeTurmas = leitor.nextInt();
		} while (quantidadeTurmas <= 0);
		
		for (int i = 1; i <= quantidadeTurmas; i++) {
			do {
				System.out.print("Informe a quantidade de alunos da " + i + " turma: ");
				quantidadeAlunos = leitor.nextInt();
			} while (quantidadeAlunos <= 0 || quantidadeAlunos > 40);
			
			somaAlunos += quantidadeAlunos;
			
		}
		numeroMedioAlunos = (float) somaAlunos / quantidadeTurmas;
		System.out.print("Cada turma possui uma média de " + numeroMedioAlunos + " de alunos.");
		
		leitor.close();
	}

}

/*
Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e
 a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
*/