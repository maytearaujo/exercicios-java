package funcoes;
import java.util.Scanner;

public class Exercicio07 {

	public static double valorPagamento (double valorPrestacao,  int diasAtraso ) {
		double multa = 0.03, jurosDia =  0.001, valorFinal;
		 
		if (diasAtraso > 0) {
			valorFinal = valorPrestacao + ((valorPrestacao * multa) + (valorPrestacao * jurosDia * diasAtraso));
		}
		else
			valorFinal = valorPrestacao;
		
		 return valorFinal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double valorPrestacao, vlTotalPrestacoes = 0, vlPagamentoFinal;
		int diasAtraso, qtdPrestacoes = 0;
		
		
		do {
		
			System.out.print("O valor da prestação: ");
			valorPrestacao = leitor.nextDouble();
			
			if (valorPrestacao != 0) {
			
				do {
					
					System.out.print("Informe o número de dias em atraso: ");
					diasAtraso = leitor.nextInt();
					
				} while (diasAtraso < 0);
				
				vlPagamentoFinal = valorPagamento(valorPrestacao, diasAtraso);
				System.out.println("Valor a ser pago: " + vlPagamentoFinal + "\n");
				
				qtdPrestacoes++;
				vlTotalPrestacoes += vlPagamentoFinal;
			}
			
		} while (valorPrestacao != 0);
		
		System.out.printf("\nRelatório do dia: \n"
				+ "Quantidade de prestações: %d\nValor total de prestações pagas no dia: %.2f", qtdPrestacoes, vlTotalPrestacoes);
		leitor.close();
	}

}
/*
Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. O programa deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação. Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.
*/