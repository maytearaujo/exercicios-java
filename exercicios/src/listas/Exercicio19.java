package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] votos = new int[6];		
		int so = 0, total = 0, indiceVencedor, vencedor;
		double [] percent = new double [6];
		ArrayList <Integer> indiceVencedorDuplicado = new ArrayList<>();
		int qtdVencedor = 0;
		boolean duplicado = false;
		
		String [] sistema = {
			"Windows Server",
			"Unix",
			"Linux",
			"Netware",
			"Mac OS",
			"Outro",
		};
		
		System.out.print("Qual o melhor Sistema Operacional para uso em servidores?\"\r\n"
				+ "\r\n"
				+ "As possíveis respostas são:\r\n"
				+ "\r\n"
				+ "1- Windows Server\r\n"
				+ "2- Unix\r\n"
				+ "3- Linux\r\n"
				+ "4- Netware\r\n"
				+ "5- Mac OS\r\n"
				+ "6- Outro\n\n");
		
		do {
			
			System.out.print("Escolha uma opção: ");
			so = input.nextInt();
			
			if (so > 0 && so <= 6) {
				votos[so-1] +=1;
				total++;
			} else if (so < 0 || so > 6){
				System.out.println("Valor inválido!");
			}
		} while ( so != 0);
	
		if (total != 0) {
			
			for (int i = 0; i < votos.length; i++) {
				percent[i] = (votos[i] * 100) /(double) total;
			}
			
			System.out.printf("\n%s %s %s\n%s %s %s\n",
					"Sistema Operacional", "Votos", "%", 
					"-------------------", "-----", "---");
			for (int i = 0; i < sistema.length; i++) {
				System.out.printf("%-19s %-5s %.1f\n", sistema[i], votos[i], percent[i]);
			}		
			
			System.out.printf("%s %s\n%-20s%d\n", "-------------------", "-----", "Total", total);
			
			vencedor = votos[0];
			indiceVencedor = 0;
					
			for ( int i = 1; i < votos.length; i++) {
				
				if (votos[i] > vencedor) {
					vencedor = votos[i];
					indiceVencedor = i;
				}
								
			}
			
			for ( int i = 0; i < votos.length; i++) {
				
				if (votos[indiceVencedor] == votos[i]) {
					qtdVencedor++;
				}
			
			}
			
			if (qtdVencedor > 1) {
				duplicado = true;
				
				for ( int i = 0; i < votos.length; i++) {
					if (votos[indiceVencedor] == votos[i]) {
						indiceVencedorDuplicado.add(i);
					}
				}
			}
			
			if (duplicado) {
				System.out.printf("\nTivemos empate:\n"
						+ "Os Sistemas Operacionais mais votados foram: \n");
				
				for (Integer i: indiceVencedorDuplicado) {
					System.out.printf(" %s\n",						
							sistema[i]);
				}
				System.out.printf("\ncom %d votos, correspondendo a %.1f%% dos votos.\n", 
						votos[indiceVencedor], percent[indiceVencedor]);
				
			} else {
				System.out.printf("\nO Sistema Operacional mais votado foi o %s, com %d votos, "
						+ "correspondendo a %.1f%% dos votos.",
						sistema[indiceVencedor], votos[indiceVencedor], percent[indiceVencedor]);
			}
		} else 
			System.out.print("\nPrograma Finalizado!");
		input.close();
		
		
	}

}

/*
Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita a um grande quantidade de organizações:
"Qual o melhor Sistema Operacional para uso em servidores?"

As possíveis respostas são:

1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Outro

Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma. O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma das opções devem ser armazenados num vetor. Após os dados terem sido completamente informados, o programa deverá calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado pela empresa, e é o seguinte:
Sistema Operacional     Votos   %
-------------------     -----   ---
Windows Server           1500   17%
Unix                     3500   40%
Linux                    3000   34%
Netware                   500    5%
Mac OS                    150    2%
Outro                     150    2%
-------------------     -----
Total                    8800

O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo a 40% dos votos.
*/