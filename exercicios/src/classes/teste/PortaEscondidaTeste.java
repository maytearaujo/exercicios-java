package classes.teste;

import java.util.Scanner;

import classes.dominio.BichinhoVirtualPlus;

public class PortaEscondidaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int opcao;
		BichinhoVirtualPlus bichinhoVirtualPlusPorta;
		String nome;
		int idade, fome, saude, qtdComida, tempoBrincadeira;

		System.out.print("Informe o nome do bichinho virtual: ");
		nome = input.nextLine();

		System.out.print("Informe a idade do bichinho virtual: ");
		idade = input.nextInt();

		System.out.print("Informe a fome do bichinho virtual: ");
		fome = input.nextInt();

		System.out.print("Informe a saúde do bichinho virtual: ");
		saude = input.nextInt();
		
		bichinhoVirtualPlusPorta = new BichinhoVirtualPlus(fome);
		
		bichinhoVirtualPlusPorta.setNome(nome);
		bichinhoVirtualPlusPorta.setIdade(idade);
		bichinhoVirtualPlusPorta.setSaude(saude);

		do {

			do {
				System.out.println("*****************************\n" + "            Menu           \n"
						+ "*****************************\n" + "1 - Alimentar\n" + "2 - Brincar\n" + "3 - Mostrar humor\n"
						+ "4 - Sair\n");
	
				System.out.print("Escolha uma opção: ");
				opcao = input.nextInt();
			} while (opcao < 0 || opcao > 4);

			switch (opcao) {

			case 1:
				System.out.print("Informe a quantidade de comida do bichinho virtual: ");
				qtdComida = input.nextInt();
				bichinhoVirtualPlusPorta.ajustarFome(qtdComida);
				break;

			case 2:
				System.out.print("Informe tempo de brincadeira do bichinho virtual: ");
				tempoBrincadeira = input.nextInt();
				bichinhoVirtualPlusPorta.ajustarTedio(tempoBrincadeira);
				break;

			case 3:
				System.out.println("Humor: " + bichinhoVirtualPlusPorta.getHumor());
				break;

			case 4:
				System.out.println("Programa Finalizado!");
				break;

			case 0:
				System.out.println(bichinhoVirtualPlusPorta.toString());
				break;
			}
			System.out.println("\n");
		} while (opcao != 4 );
	}

}
