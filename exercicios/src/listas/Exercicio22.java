package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int defeito, qtdMouses = 0;
		int idMouse;
		//ArrayList <Integer> idsDefeito = new ArrayList<>();
		int [] qtdDefeitos = new int [4];
		
		String [] tiposDefeitos = {
				"necessita da esfera",
				"necessita de limpeza",
				"necessita troca do cabo ou conector",
				"quebrado ou inutilizado" 
		};
			
		System.out.printf("%s\n %s\n %s\n %s\n %s\n",
				"Defeitos dos mouses: ",
				"1 - necessita da esfera",
				"2 - necessita de limpeza",
				"3 - necessita troca do cabo ou conector",
				"4 - quebrado ou inutilizado\n" );
		
		do {
			
			System.out.print("Informe o número de identificação do mouse: ");
			idMouse = input.nextInt();

			if (idMouse != 0) {
				
				System.out.print("Informe o defeito: ");
				defeito = input.nextInt();
				
				if (defeito >= 1 && defeito <= 4) {
	
					qtdDefeitos[defeito-1] += 1;						
					qtdMouses++;		
				} else
					System.out.print("Defeito inválido!\n");
			}				
			
		} while (idMouse != 0);
		
		if (qtdMouses != 0) {
			
			System.out.printf("\nQuantidade de mouses: %d\n\n", qtdMouses);
			
			System.out.printf("%-45s %s %s\n", "Situação", "Quantidade", "Percentual");
			
			for (int i = 0; i < qtdDefeitos.length; i++) {
				System.out.printf("%-2d - %-40s %-10d %.1f%%\n", 
						(i + 1), tiposDefeitos[i], qtdDefeitos[i], (qtdDefeitos[i] * 100) / (double)qtdMouses);
			}
		} else {
			System.out.print("Programa Finalizado!");
		}
		
		input.close();
	}

}

/*
Sua organização acaba de contratar um estagiário para trabalhar no Suporte de Informática, com a intenção de fazer um levantamento nas sucatas encontradas nesta área. A primeira tarefa dele é testar todos os cerca de 200 mouses que se encontram lá, testando e anotando o estado de cada um deles, para verificar o que se pode aproveitar deles.
Foi requisitado que você desenvolva um programa para registrar este levantamento. O programa deverá receber um número indeterminado de entradas, cada uma contendo: um número de identificação do mouse o tipo de defeito:
necessita da esfera;
necessita de limpeza; 
necessita troca do cabo ou conector; 
quebrado ou inutilizado.
Uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatório:
Quantidade de mouses: 100

Situação                        Quantidade              Percentual
1- necessita da esfera                  40                     40%
2- necessita de limpeza                 30                     30%
3- necessita troca do cabo ou conector  15                     15%
4- quebrado ou inutilizado              15                     15%
*/