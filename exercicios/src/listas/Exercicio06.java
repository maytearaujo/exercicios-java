package listas;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float [][] notas = new float [10][4];
		float soma;
		float [] medias = new float [10];
		int mediasMaior7 = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Informe a " + (j+1) + "ª notas do " + (i+1) + "º aluno: ");
				notas[i][j] = input.nextFloat();
			}
			System.out.println(" ");

		}
		
		for (int i = 0; i < notas.length; i++) {
			soma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / notas[i].length;
			
			if (medias[i] >= 7)
				mediasMaior7++ ;
		}
		
		System.out.printf("%d  alunos com média maior ou igual a 7.0", mediasMaior7);
		
		input.close();
		
	}

}


/*
Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
*/