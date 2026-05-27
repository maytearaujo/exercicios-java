package repeticao;

public class Exercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioInicial = 1000, salarioAtual;
		double taxaAumento = 0.015, valorAumento;

		valorAumento = salarioInicial * taxaAumento;
		salarioAtual = salarioInicial + valorAumento;
		
		for (int i = 1997; i <= 2026; i++) {
			taxaAumento = taxaAumento * 2;
			valorAumento = salarioAtual * taxaAumento;
			salarioAtual = salarioAtual + valorAumento;
		}
		System.out.printf("Salário Atual: %.2f", salarioAtual);
	}

}


/*

Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do 
percentual do ano anterior. Faça um programa que determine o salário atual desse funcionário. 
Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.
*/
