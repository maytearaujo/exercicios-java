package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char resposta;
		int [] codigo = {100, 101, 102, 103, 104, 105};
		boolean isCodigoInvalido = false;
		int codigoItem, qtdItem, quantidadeAtual;
		float totalGeral = 0;
		ArrayList<ArrayList<Integer>> compra = new ArrayList<>();
		ArrayList<Integer> itemCompra = new ArrayList<>();
		float totalItem ;
		final int INDEX_CODIGO = 0, INDEX_QTD = 1;
		
		String [] especificacao = {
				"Cachorro Quente", 
				"Bauru Simples",   
				"Bauru com ovo",   
				"Hambúrguer",      
				"Cheeseburguer",   
				"Refrigerante"
		};  
		
		float [] preco = {1.20f, 1.30f, 1.50f, 1.20f, 1.30f, 1.0f};
		
		do {
			
			do {
				System.out.print("Informe o código do item: ");
				codigoItem = input.nextInt();
				
				for (int c : codigo) {
					if (codigoItem == c )
						isCodigoInvalido = true;					
				}
			} while (!isCodigoInvalido );
			
			do {
				System.out.print("Informe a quantidade: ");
				qtdItem = input.nextInt();
			} while (qtdItem <= 0);
			
			itemCompra.add(codigoItem);
			itemCompra.add(qtdItem);
			
			compra.add(itemCompra);
			
			do {
				
				System.out.println("Deseja solicitar outro item? \n S - Sim   N - Não: ");
				resposta = Character.toLowerCase(input.next().charAt(0));	

				if (resposta == 's') {
					isCodigoInvalido = false;
					itemCompra = new ArrayList<>();
				}
			} while (resposta != 's' && resposta != 'n');
			
		} while (resposta == 's');
		
		System.out.printf("\n%s %10s %15s\n", "QTD", "PRODUTO", "PREÇO");
		for (int i = 0; i < compra.size(); i++) {
				for (int c = 0; c < codigo.length; c++) {
					if (compra.get(i).get(INDEX_CODIGO) == codigo[c]) {
						quantidadeAtual = compra.get(i).get(INDEX_QTD);
						totalItem = preco[c] * quantidadeAtual;
						System.out.printf("%-3d %-20s %-12.2f\n", 
								quantidadeAtual, 
								especificacao[c], 
								totalItem);
						totalGeral += totalItem;
					
				}
			}
		}
		System.out.println("-----------------------------");
		
		System.out.printf("Total %23.2f", totalGeral);
		input.close();
	}

}

/*
O cardápio de uma lanchonete é o seguinte:
Especificação   Código  Preço
Cachorro Quente 100     R$ 1,20
Bauru Simples   101     R$ 1,30
Bauru com ovo   102     R$ 1,50
Hambúrguer      103     R$ 1,20
Cheeseburguer   104     R$ 1,30
Refrigerante    105     R$ 1,00
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item 
(preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.

*/