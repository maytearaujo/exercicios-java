package listas;
import java.util.Random;

public class Exercicio24 {
	
	public static int gerarNumeros() {
		Random gerador = new Random();
		
		return gerador.nextInt(1,7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] contador = new int[6];
		int [] numeros = new int [100];
		
		for (int i = 0; i < 100; i++) {
			numeros[i] = gerarNumeros();
		}
		
		for (int i = 0; i < 100; i++) {
			int indice = numeros[i] - 1; 
			contador[indice] += 1;
		}

		System.out.printf("Resultado\n%-7s %-11s\n", "Numeros", "Lançamentos");
		
		for (int i = 0; i < contador.length; i ++) {
			System.out.printf("%-10d %-15d\n", (i + 1), contador[i]);
		}
	}

}
/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene os resultados em um vetor . Depois, mostre quantas vezes cada valor foi conseguido. Dica: use um vetor de contadores(1-6) e uma função para gerar numeros aleatórios, simulando os lançamentos dos dados.
*/