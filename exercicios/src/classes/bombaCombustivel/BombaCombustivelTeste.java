package classes.bombaCombustivel;
import java.util.Scanner;

public class BombaCombustivelTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BombaCombustivel bombaCombustivel = new BombaCombustivel(TipoCombustivel.GASOLINA, 6.58, 15000);
		int opcao;
		double valorAbastecimento, qtdLitros, custo, valorLitro;
		TipoCombustivel tipoCombustivel = null;
		String combustivel;
		boolean combustivelValido = false;
		
		do {
			
		
			do {
			System.out.println(
					"********************************************\n"
					+"                   MENU                    \n"
					+"*******************************************\n"
					+ "1 - Abastecer Por Valor \n"
					+ "2 - Abastecer Por Litro\n"
					+ "3 - Altera o valor do litro do combustível\n"
					+ "4 - Alterar tipo de Combustivel\n"
					+ "5 - Estado atual da bomba\n"
					+ "0 - Sair\n"
					+"*******************************************\n");
			
				System.out.print("Escolha uma opção: ");
				opcao = input.nextInt();			
			} while (opcao < 0 || opcao > 5);
			
			switch (opcao) {
			case 0: 
				System.out.println("\nO programa está sendo finalizado!");
				break;
				
			case 1:
				do {
					System.out.print("\nInforme o valor que deseja abastecer: ");
					valorAbastecimento = input.nextDouble();
					
				} while (valorAbastecimento <= 0);
				
				qtdLitros = bombaCombustivel.abastecerPorValor(valorAbastecimento);
				
				if (qtdLitros == 0) {
					System.out.println("Quantidade de combustível indisponível no momento.");
				} else {
				
				System.out.printf("\nO veículo foi abastecido com %.2f litros.\n", qtdLitros);
				}
				break;
				
			case 2:
				do {
					
					System.out.print("\nInforme a quantidade de litros: ");
					qtdLitros = input.nextDouble();				
					
				} while (qtdLitros <= 0);
				
				custo = bombaCombustivel.abastecerPorLitro(qtdLitros);
				
				if (custo == 0) {
					System.out.println("Quantidade de combustível indisponível no momento.");
				} else {
					System.out.printf("O valor é ser pago é: R$ %.2f", custo );
				}
				break;
				
			case 3:
				do {
					
					System.out.print("\nInforme o novo valor do litro: ");
					valorLitro = input.nextDouble();				
					
				} while (valorLitro <= 0);
				
				bombaCombustivel.alterarValor(valorLitro);
				break;
				
			case 4:
				 combustivelValido = false;
				do {
					
					input.nextLine();
					System.out.print("Informe tipo de combustivel: ");
					combustivel = input.nextLine().trim().toUpperCase();
					
					for (TipoCombustivel tipo: TipoCombustivel.values()) {
						
						if (tipo.name().equals(combustivel)) {
							combustivelValido = true;
							break;
						}
					}
					
					if (!combustivelValido) {
						System.out.println("Combustível inválido, tente novamente.");
					}
					
				} while (!combustivelValido );
				//TipoCombustivel.valueOf(combustivel);
				tipoCombustivel = TipoCombustivel.valueOf(combustivel);
				bombaCombustivel.alterarCombustivel(tipoCombustivel);
				System.out.println("Tipo de combustível alterado com sucesso");
				break;
			case 5:
				
				System.out.println("\n"
						+ "Combustível: " + bombaCombustivel.getTipoCombustivel() + "\n"
						+ "Valor/Litro: R$ " + bombaCombustivel.getValorLitro() + "\n"
						+ "Quantidade restante: " + bombaCombustivel.getQtdCombustivel() + " litros");
				break;
			}
			System.out.println("\n");
			
		} while (opcao != 0);
		input.close();
	}

}

/*
Classe Bomba de Combustível: Faça um programa completo utilizando classes e métodos que:

a. Possua uma classe chamada bombaCombustível, com no mínimo esses atributos:
I - tipoCombustivel.
II - valorLitro
III - quantidadeCombustivel
b. Possua no mínimo esses métodos:
I - abastecerPorValor( ) – método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
II - abastecerPorLitro( ) – método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
III - alterarValor( ) – altera o valor do litro do combustível.
IV - alterarCombustivel( ) – altera o tipo do combustível.
V - alterarQuantidadeCombustivel( ) – altera a quantidade de combustível restante na bomba.
OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.
*/