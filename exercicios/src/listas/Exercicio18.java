package listas;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Exercicio18 {
		
		public static double calcularPercentualVotos(int votos, int totalVotos ) {
			
			return (votos * 100) / (double)totalVotos;

		}
		
		public static void salvarArquivo(String conteudo) {

			try {
				String caminho = "arquivos\\listas_exercicio18.txt";
				BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, false));
				
				escritor.write(conteudo);
				
				escritor.close();
				
			} catch (Exception erro) {
				
				erro.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int jogador, totalVotos = 0;
		int [] votacao = new int[23];
		double [] percentVotos = new double[23];
		int maisVotos = 0, indiceMaisVotos = 0;
		String resultado = "", voto, descricaoResultado, resultadoFinal;
		
		System.out.println("Enquete: Quem foi o melhor jogador?\n");
		do {
							
				System.out.print("Informe o número do jogador: ");
				jogador = input.nextInt();
				
				if (jogador < 0 || jogador > 23)
					System.out.println("Número inválido!\n");
				else if (jogador >=1 && jogador <= 23) {
					totalVotos++;
					votacao[jogador - 1] += 1;
				}
			
		} while (jogador != 0);		
		
		descricaoResultado ="Resultado da votação:\n"
				+ "\nForam computados " + totalVotos + " votos.\n\n"
				+ "JOGADOR    VOTOS    PORCENTAGEM\n";
		
		resultado = resultado.concat(descricaoResultado);
				
		for (int i = 0; i < votacao.length; i++) {
			
			if (votacao[i] != 0) {
				
				percentVotos[i] = calcularPercentualVotos(votacao[i], totalVotos);
				voto = String.format("%-10d %-8d %-8.1f\n", (i + 1), votacao[i], percentVotos[i]);
				
				resultado = resultado.concat(voto);

			}
		}
				
		for (int i = 0; i < votacao.length; i++) {
			
			if (votacao[i] > maisVotos) {
				maisVotos = votacao[i];
				indiceMaisVotos = i;
			}
			
		}
		
		resultadoFinal = String.format("\nO melhor jogador foi o número %d, com %d votos, "
				+ "correspondendo a %.1f%% do total de votos.", 
				indiceMaisVotos+1, votacao[indiceMaisVotos], percentVotos[indiceMaisVotos]);
		
		resultado = resultado.concat(resultadoFinal);
		
		System.out.println(resultado);

		salvarArquivo(resultado);

		input.close();

	}

}



/*
Uma grande emissora de televisão quer fazer uma enquete entre os seus telespectadores para saber qual o melhor jogador após cada jogo. Para isto, faz-se necessário o desenvolvimento de um programa, que será utilizado pelas telefonistas, para a computação dos votos. Sua equipe foi contratada para desenvolver este programa, utilizando a linguagem de programação Java. Para computar cada voto, a telefonista digitará um número, entre 1 e 23, correspondente ao número da camisa do jogador. Um número de jogador igual zero, indica que a votação foi encerrada. Se um número inválido for digitado, o programa deve ignorá-lo, mostrando uma breve mensagem de aviso, e voltando a pedir outro número. Após o final da votação, o programa deverá exibir:
O total de votos computados;
Os númeos e respectivos votos de todos os jogadores que receberam votos;
O percentual de votos de cada um destes jogadores;
O número do jogador escolhido como o melhor jogador da partida, juntamente com o número de votos e o percentual de votos dados a ele.
Observe que os votos inválidos e o zero final não devem ser computados como votos. O resultado aparece ordenado pelo número do jogador. O programa deve fazer uso de arrays. O programa deverá executar o cálculo do percentual de cada jogador através de uma função. Esta função receberá dois parâmetros: o número de votos de um jogador e o total de votos. A função calculará o percentual e retornará o valor calculado. Abaixo segue uma tela de exemplo. O disposição das informações deve ser o mais próxima possível ao exemplo. Os dados são fictícios e podem mudar a cada execução do programa. 
Ao final, o programa deve ainda gravar os dados referentes ao resultado da votação em um arquivo texto no disco, obedecendo a mesma disposição apresentada na tela.
Enquete: Quem foi o melhor jogador?

Número do jogador (0=fim): 9
Número do jogador (0=fim): 10
Número do jogador (0=fim): 9
Número do jogador (0=fim): 10
Número do jogador (0=fim): 11
Número do jogador (0=fim): 10
Número do jogador (0=fim): 50
Informe um valor entre 1 e 23 ou 0 para sair!
Número do jogador (0=fim): 9
Número do jogador (0=fim): 9
Número do jogador (0=fim): 0

Resultado da votação:

Foram computados 8 votos.

Jogador Votos           %
9               4               50,0%
10              3               37,5%
11              1               12,5%
O melhor jogador foi o número 9, com 4 votos, correspondendo a 50% do total de votos.
*/