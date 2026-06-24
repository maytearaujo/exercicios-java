package funcoes;
import java.util.Random;

public class Exercicio10 {
	public static String lancarDados() {
		
		int resultado, dado1, dado2, ponto = 0;
		Random gerador = new Random();
		String tipoJogador = "", situacao = "";
		
		dado1 = gerador.nextInt(1, 7);
		dado2 = gerador.nextInt(1, 7);
		
		resultado = dado1 + dado2;
		
		System.out.println("Jogada 1: " + resultado);
		
		if (resultado == 7 || resultado == 11) {
			tipoJogador = "Natural";
			situacao = "Vencedor";
		}
		else if (resultado == 2 || resultado == 3 || resultado == 12) {
			tipoJogador = "craps";
			situacao = "Perdedor";
		}
		else {
			
			ponto = resultado;
			
			do {
				
				resultado = gerador.nextInt(2, 13);
				System.out.println("Nova Jogada: " + resultado);


				
			} while (resultado != ponto && resultado != 7);
			
			if (resultado == 7)
				situacao = "Perdedor";
			else
				situacao = "Vencedor";
		}
		
		
		return situacao + " " + tipoJogador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(lancarDados());
	}

}
/*
Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.
*/