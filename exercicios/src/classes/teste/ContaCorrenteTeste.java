package classes.teste;
import java.util.Scanner;
import classes.dominio.ContaCorrente;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente(1234, "Maristela Duarte");
		int opcao;
		String nomeCorrentista;
		double valorDeposito, valorSaque;
		
		do {
		
			System.out.println("\n"
					+ "1 - AlterarNome\n"
					+ "2 - Depósitar\n"
					+ "3 - Saque\n"
					+ "4 - Consulta Saldo\n"
					+ "5 - Finalizar\n");
			
			do {
				
				System.out.print("Escolha uma opção: ");
				opcao = input.nextInt();
				
			} while (opcao < 1 || opcao > 5);
			
			
			if (opcao == 5) {
				System.out.println("Programa finalizado!");
			} else {
				switch (opcao) {
					case 1:
						System.out.print("\nDigite o nome correto: ");
						input.nextLine();
						nomeCorrentista = input.nextLine();
						
						contaCorrente.alterarNome(nomeCorrentista);
						break;
						
					case 2:
						do {
										
							System.out.print("\nInforme o valor do depósito: ");
							valorDeposito = input.nextDouble();
							
						} while (valorDeposito <= 0);
						
						if (contaCorrente.depositar(valorDeposito) == false) {
							
							System.out.println("Verifique o valor do deposito.");
							
						} else {
							
							System.out.println("Depósito realizado.");
						}
						
			
						break;
						
					case 3:
						do {
							
							System.out.print("\nInforme o valor do saque: ");
							valorSaque = input.nextDouble();
							
						} while (valorSaque <= 0);
						
						if (contaCorrente.sacar(valorSaque) == false) {
							
							System.out.println("Saldo insuficiente.");
						} else {
							System.out.println("Saque realizado.");

						}
						
						break;
						
					case 4:
						
						System.out.println("Dados da Conta:\n"
								+ "Correntista" + contaCorrente.getNomeCorrentista()
								+ "Conta: " + contaCorrente.getNumeroConta()
								+ "Saldo: " + contaCorrente.getSaldo());
						break;
						
					default :
						System.out.println("\nOpção inválida.");
				}
			}
		} while (opcao != 5);
		
		input.close();
	}

}
/*
Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
*/