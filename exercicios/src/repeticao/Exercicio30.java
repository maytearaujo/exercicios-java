package repeticao;
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float preco;
		
		do {
			System.out.print("Informe o preço da unidade do pão: ");
			preco = leitor.nextFloat();
		} while (preco <= 0);

		System.out.println("Panificadora Pão de Ontem - Tabela de preço");
		
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%d - R$ %.2f\n", i, (preco * i));
		}
		leitor.close();
	}

}
/*
O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00
*/