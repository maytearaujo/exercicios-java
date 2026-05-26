package repeticao;
import java.util.Scanner;

public class Exercicioo41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorDivida, valorDividaJuros = 0, valorJuros = 0, valorParcela = 0, percentJuros = 0;
		int [] qtdParcelas = {1, 3, 6, 9, 12};
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.print("Informe o valor da dívida: ");
			valorDivida = input.nextFloat();
			
		} while (valorDivida <= 0);
		
		System.out.printf("%-20s %-20s %-20s %-20s", 
				"Valor da Dívida", 
				"Valor dos Juros", 
				"Quantidade de Parcelas", 
				"Valor da Parcela");
		
		for (int parcelas :qtdParcelas) {
			
			if (parcelas == 1 ){
     			percentJuros = 0;				
			}
			
			else if (parcelas == 3 ){
     			percentJuros = 0.10f;				
			}
			
			else if (parcelas == 6 ){
     			percentJuros = 0.15f;				
			}
			
			else if (parcelas == 9 ){
           		percentJuros = 0.20f;				
			}
			
			else if (parcelas == 12){
           		percentJuros = 0.25f;
			}
			
			valorJuros = valorDivida * percentJuros;
			valorDividaJuros = valorDivida + valorJuros;
			valorParcela = valorDividaJuros / parcelas;
			System.out.printf("\nR$ %-17.2f %-20.0f %-20d R$ %.2f",
					valorDividaJuros, 
					valorJuros, 
					parcelas, 
					valorParcela);
		}
		
		input.close();
			
	}

}

/*
 Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: 
 valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
 
Os juros e a quantidade de parcelas seguem a tabela abaixo:
Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
1      					 0
3      				     10
6      				     15
9            			 20
12           			 25

Exemplo de saída do programa:
Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
R$ 1.000,00     0               1                       R$  1.000,00
R$ 1.100,00     100             3                       R$    366,00
R$ 1.150,00     150             6                       R$    191,67
 
 */