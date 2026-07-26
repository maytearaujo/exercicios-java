package classes.teste;
import classes.dominio.ContaInvestimento;

public class ContaInvestimentoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaInvestimento contaInvestimento = new ContaInvestimento(12345, "Marilia Gabriel", 1000, 0.1 );
		contaInvestimento.adicioneJuros();
		contaInvestimento.adicioneJuros();
		contaInvestimento.adicioneJuros();
		contaInvestimento.adicioneJuros();
		contaInvestimento.adicioneJuros();
		System.out.println("Saldo: " + contaInvestimento.getSaldo());
	}

}

/*
Classe Conta de Investimento: Faça uma classe contaInvestimento que seja semelhante a classe contaBancaria, com a diferença de que se adicione um atributo taxaJuros. Forneça um construtor que configure tanto o saldo inicial como a taxa de juros. Forneça um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta. Escreva um programa que construa uma poupança com um saldo inicial de R$1000,00 e uma taxa de juros de 10%. Depois aplique o método adicioneJuros() cinco vezes e imprime o saldo resultante.
*/