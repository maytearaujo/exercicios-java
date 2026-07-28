package classes.teste;
import java.util.ArrayList;
import java.util.Scanner;

import classes.dominio.BichinhoVirtual;
import classes.dominio.BichinhoVirtualPlus;

public class BichinhoVirtualFazendaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, qtdComida, tempoBrincadeira;
		Scanner input = new Scanner(System.in);
		
		BichinhoVirtualPlus bichinhoVirtual1 = new BichinhoVirtualPlus("Zilar", 60, 90, 43, 30);
		BichinhoVirtualPlus bichinhoVirtual2 = new BichinhoVirtualPlus("Xavier", 30, 80, 23, 40);
		BichinhoVirtualPlus bichinhoVirtual3 = new BichinhoVirtualPlus("Naiane", 20, 70, 63, 50);
		BichinhoVirtualPlus bichinhoVirtual4 = new BichinhoVirtualPlus("Ronei", 60, 60, 84, 60);
		
		ArrayList <BichinhoVirtualPlus> bichinhos = new ArrayList<>();
		
		bichinhos.add(bichinhoVirtual1);
		bichinhos.add(bichinhoVirtual2);
		bichinhos.add(bichinhoVirtual3);
		bichinhos.add(bichinhoVirtual4);
		
		do {

			do {
				System.out.println("\n*****************************\n" + 
			"            Menu           \n"
						+ "*****************************\n" + 
						"1 - Alimentar\n" + 
						"2 - Brincar\n" + 
						"3 - Mostrar humor\n"+
						"4 - Informações sobre os bixhinhos" +
						"0 - Sair\n");
	
				System.out.print("Escolha uma opção: ");
				opcao = input.nextInt();
			} while (opcao < 0 || opcao > 4);

			switch (opcao) {

			case 0:
				System.out.println("Programa Finalizado!");
				break;
				
			case 1:
				System.out.print("Informe a quantidade de comida dos bichinhos virtuais: ");
				qtdComida = input.nextInt();
				
				for (BichinhoVirtualPlus bixo: bichinhos) {
					
					bixo.ajustarFome(qtdComida);
				}
				break;

			case 2:
				System.out.print("Informe tempo de brincadeira do bichinho virtual: ");
				tempoBrincadeira = input.nextInt();
				
				for (BichinhoVirtualPlus bixo: bichinhos) {
					
					bixo.ajustarTedio(tempoBrincadeira);
				}
				break;

			case 3:
				int i = 1;
				for(BichinhoVirtualPlus bixo: bichinhos) {
					
					System.out.println("Humor " + i++ +": " + bixo.getHumor());
				}
				break;

			case 4:

				for (BichinhoVirtual bixo : bichinhos ) {
					System.out.println(bixo.toString() + "\n");
				}
				break;
			}
			System.out.println("\n");
		} while (opcao != 0 );
		

		input.close();
	}

}
/*
Crie uma Fazenda de Bichinhos instanciando vários objetos bichinho e mantendo o controle deles através de uma lista. Imite o funcionamento do programa básico, mas ao invés de exigis que o usuário tome conta de um único bichinho, exija que ele tome conta da fazenda inteira. Cada opção do menu deveria permitir que o usuário executasse uma ação para todos os bichinhos (alimentar todos os bichinhos, brincar com todos os bichinhos, ou ouvir a todos os bichinhos). Para tornar o programa mais interessante, dê para cada bichinho um nivel inicial aleatório de fome e tédio.

*/