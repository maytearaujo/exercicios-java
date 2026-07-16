package classes.teste;
import java.util.Scanner;
import classes.dominio.Televisor;

public class TelevisorTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Televisor televisor = new Televisor();
		int opcao, numeroCanal;
		
		do {
			
			do {
			
			System.out.println("\n"
					+ "1 - Trocar canal\r\n"
					+ "2 - Aumentar volume\r\n"
					+ "3 - Diminuir volume\r\n"
					+ "4 - Mostrar informações\r\n"
					+ "0 - Sair");
			opcao = input.nextInt();
			
			} while (opcao < 0 || opcao > 4);
			
			switch (opcao) {
				case 1:
					System.out.print("\nInforme o número do canal: ");
					numeroCanal = input.nextInt();
					
					if (!televisor.trocarCanal(numeroCanal)) {
						System.out.println("Canal inválido!");
					} else
					    System.out.println("Canal alterado.");
					
					break;
					
				case 2:
					televisor.aumentarVolume();
					System.out.println(televisor.getVolume());
					break;
					
				case 3:
					televisor.diminuirVolume();
					System.out.println(televisor.getVolume());
					break;

				case 4:
					System.out.println("\nCanal:" + televisor.getNumeroCanal() 
					+ "\nVolume: " + televisor.getVolume() + "\n"
					+ "Série: " + televisor.getClass());
					break;
				case 0:
					System.out.println("\nDesligando Televisor.");
					break;
			}
			
		} while (opcao != 0);
			
		input.close();
		
	}

}
/*
Classe TV: Faça um programa que simule um televisor criando-o como um objeto. O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume. Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.
*/