package listas;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] idades = {
				1, 2, 3, 4, 5, 6, 
				7, 8, 9, 10, 11, 12, 
				13, 14, 15,	16, 17, 18, 
				19, 20, 21, 22, 23, 24, 
				25, 26, 27, 28, 29, 30
				};
		
		double[] alturas = {
			    1.92, 1.52, 1.68, 1.65, 1.98, 1.94,
			    2.08, 1.56, 1.77, 1.52, 1.64, 1.83,
			    1.52, 1.63, 1.92, 1.85, 1.64, 1.88,
			    2.03, 1.50, 2.02, 1.95, 1.72, 1.60,
			    2.12, 1.72, 1.56, 1.56, 2.05, 1.89
			};
		
		double soma = 0, media;
		int qtdAlturasMenorMedia = 0;
		
		for (double altura: alturas) {
			soma += altura;
		}
		
		media = soma / alturas.length;
		
		for (int i = 0; i < alturas.length; i++) {
			if (idades[i] > 13 && alturas[i] < media)
				qtdAlturasMenorMedia++;
				
		}
		
		System.out.printf("\n%d alunos com mais de 13 anos possuem altura inferior à média de %.1f ", qtdAlturasMenorMedia, media);
		leitor.close();
	}

}
/*
Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos alunos com 
mais de 13 anos possuem altura inferior à média de altura desses alunos.
*/