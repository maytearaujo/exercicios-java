package decisao;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int tipoCarne, tipoPagamento;
		float peso, precokg = 0, precoTotal, valorDesconto = 0, valorPagamento;
		boolean isInvalidMeatType = false;
		String nameMeat ="", namePayment="";
		
		System.out.print("Escolha a carne em promoção: \n 1 - File Duplo\n 2 - Alcatra\n 3 - Picanha\n");
		tipoCarne = leitor.nextInt();
		
		System.out.print("Informe a quantidade (KG) de carne que deseja: ");
		peso = leitor.nextFloat();
		
		System.out.print("Informe o tipo de pagamento:\n 1 - Dinheiro\n 2 - Pix\n 3 - Cartão de Débito\n 4 - Cartão de Crédito\n 5 - Cartão Tabajara\n");
		tipoPagamento = leitor.nextInt();
		
		switch (tipoCarne) {
		case 1:
			nameMeat = "File Duplo";
			if (peso > 0 && peso <= 5)
				precokg = 4.9f;
			else if (peso > 5)
				precokg = 5.8f;
			break;
		case 2:
			nameMeat = "Alcatra";
			if (peso > 0 && peso <= 5)
				precokg = 5.9f;
			else if (peso > 5)
				precokg = 6.8f;
			break;
		case 3:
			nameMeat = "Picanha";
			if (peso > 0 && peso <= 5)
				precokg = 6.9f;
			else if (peso > 5)
				precokg = 7.8f;
			break;
		default:
			isInvalidMeatType = true;
			break;
		}
		
		 
		
		if (isInvalidMeatType || peso <= 0 || (tipoPagamento <= 0 || tipoPagamento > 5))
			System.out.println("Verifique os dados digitados.");
		else {
			precoTotal = precokg * peso;
			valorPagamento = precoTotal;
			
			if (tipoPagamento == 5) {
				valorDesconto = precoTotal * 0.05f;			
				valorPagamento = precoTotal - valorDesconto;
			}					
					
			if (tipoPagamento == 1)
				namePayment = "Dinheiro";			else if (tipoPagamento == 2)
				namePayment = "Pix";			else if (tipoPagamento == 3)
				namePayment = "Cartão de Débito";			else if (tipoPagamento == 4)
				namePayment = "Cartão de Crédito";			else if (tipoPagamento == 5)
				namePayment = "Cartão Tabajara";
			 
			System.out.printf("\n\n     Cupom Fiscal     \n"
					+ "Produto: %s\n"
					+ "Quantidade de carne: %.0fkg\n"
					+ "Preço total: %.2f\n"
					+ "Tipo de pagamento: %s\n"
					+ "Valor do desconto: %.2f\n"
					+ "Valor a pagar %.2f",
					nameMeat, peso, precoTotal, namePayment, valorDesconto, valorPagamento);
		}
		leitor.close();
	}

}

/*
 O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara 
o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o 
tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as 
informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
 */